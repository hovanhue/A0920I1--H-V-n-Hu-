package dao;

import model.User;
import ultils.ConnectionDB;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {

    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";
    private static final String SORT_BY_NAME_SQL ="SELECT * FROM user.users ORDER BY NAME DESC;";
    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";
    private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";
    private static final String SQL_UPDATE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";
    private static final String SQL_TABLE_CREATE = "CREATE TABLE EMPLOYEE"
            + "("
            + " ID serial,"
            + " NAME varchar(100) NOT NULL,"
            + " SALARY numeric(15, 2) NOT NULL,"
            + " CREATED_DATE timestamp,"
            + " PRIMARY KEY (ID)"
            + ")";
    private static final String SQL_TABLE_DROP = "DROP TABLE IF EXISTS EMPLOYEE";


    @Override
    public void insertUser(User user) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(INSERT_USERS_SQL);
            statement.setString(1, user.name);
            statement.setString(2, user.email);
            statement.setString(3, user.country);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User selectUser(int id) {
        User user = null;
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_USER_BY_ID);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean rowDeleted = false;
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(DELETE_USERS_SQL);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public boolean updateUser(User user) {
        boolean rowUpdated = false;
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(UPDATE_USERS_SQL);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());
            statement.setInt(4, user.getId());

            rowUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    @Override
    public void findByCountry() {
        Connection connection;

    }

    @Override
    public void sortByName() {

    }

    public User getUserById(int id) {
        User user = null;
        String query = "{CALL get_user_by_id(?)}";
        Connection connection;
        CallableStatement callableStatement;
        try {
            connection = ConnectionDB.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setInt(1, id);
            ResultSet rs = callableStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        String query = "{CALL insert_user(?,?,?)}";
        Connection connection;
        CallableStatement statement;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareCall(query);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());
            System.out.println(statement);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addUserTransaction(User user, int[] permisions) {
        Connection connection = null;
        PreparedStatement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connection = ConnectionDB.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(INSERT_USERS_SQL, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());
            int rowAffected = statement.executeUpdate();
            rs = statement.getGeneratedKeys();
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt(1);
            }
            if (rowAffected == 1) {
                String sql = "INSERT INTO user_permision(user_id, permision_id)" +
                        " values(?,?)";
                preparedStatement = connection.prepareStatement(sql);
                for (int permisionId : permisions) {
                    preparedStatement.setInt(1, userId);
                    preparedStatement.setInt(2, permisionId);
                    preparedStatement.executeUpdate();
                }
                connection.commit();
            } else {
                connection.rollback();
            }
        } catch (SQLException e) {
            try {
                if (connection != null)
                    connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (connection != null) connection.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void insertUpdateWithoutTransaction() {
        Connection connection;
        PreparedStatement statementInsert;
        PreparedStatement statementUpdate;
        Statement statement = null;
        try{
            connection = ConnectionDB.getConnection();
            statementInsert = connection.prepareStatement(SQL_INSERT);
            statementUpdate = connection.prepareStatement(SQL_UPDATE);
            statement = connection.createStatement();
            statement.execute(SQL_TABLE_DROP);
            statement.execute(SQL_TABLE_CREATE);
            statementInsert.setString(1,"Hue");
            statementInsert.setBigDecimal(2, new BigDecimal(10));
            statementInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            statementInsert.execute();

            statementInsert.setString(1,"Ngan");
            statementInsert.setBigDecimal(2, new BigDecimal(20));
            statementInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            statementInsert.execute();
            statementUpdate.setBigDecimal(2, new BigDecimal(999.99));
            statementUpdate.setString(2, "Quynh");
            statementUpdate.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertUpdateUseTransaction() {
        Connection connection;
        Statement statement;
        PreparedStatement psInsert;
        PreparedStatement psUpdate;
        try{
            connection = ConnectionDB.getConnection();
            statement = connection.createStatement();
            psInsert = connection.prepareStatement(SQL_INSERT);
            psUpdate = connection.prepareStatement(SQL_UPDATE);
            statement.execute(SQL_TABLE_DROP);
            statement.execute(SQL_TABLE_CREATE);
            connection.setAutoCommit(false);

            psInsert.setString(1, "Quynh");
            psInsert.setBigDecimal(2, new BigDecimal(10));
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();

            psInsert.setString(1, "Ngan");
            psInsert.setBigDecimal(2, new BigDecimal(20));
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();

            psUpdate.setBigDecimal(1, new BigDecimal(999.99));
            psUpdate.setString(2, "Quynh");
            psUpdate.execute();

            connection.commit();
            connection.setAutoCommit(true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void getAllUserTransaction() {
        String sql = "call getAll_user();";
        Connection connection;
        CallableStatement callableStatement;
        try{
            connection = ConnectionDB.getConnection();
            callableStatement = connection.prepareCall(sql);
            callableStatement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void editUserByIDTransaction(User user) {
        String sql = "call editUser(?,?,?,?);";
        Connection connection;
        CallableStatement callableStatement;
        try{
            connection = ConnectionDB.getConnection();
            callableStatement = connection.prepareCall(sql);
            callableStatement.setString(1, user.name);
            callableStatement.setString(2, user.email);
            callableStatement.setString(3, user.country);
            callableStatement.setInt(4, user.id);
            callableStatement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUserTransaction(int id) {
        String sql = "call DeleteUser(?);";
        Connection connection;
        CallableStatement callableStatement;
        try{
            connection = ConnectionDB.getConnection();
            callableStatement = connection.prepareCall(sql);
//            callableStatement.setInt(id);
            callableStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
