package dao.serviceImp;

import dao.CustomerImpl;
import model.Customer;
import ultils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements CustomerImpl {
    private static final String INSERT_CUSTOMER_SQL = "insert into customer values (?,?,?,?,?,?,?,?,?)";
    private static final String SELECT_CUSTOMER_BY_ID = "Select * from customer where customer_id = ?";
    private static final String SELECT_ALL_CUSTOMER = "Select * from customer";
    private static final String DELETE_CUSTOMER_BY_ID = "Delete from customer where customer_id = ?";
    private static final String UPDATE_CUSTOMER = "Update customer set customer_type_id = ?, customer_name = ?, customer_birthday = ?, customer_birthday = ? ," +
            "customer_gender = ?, customer_idCard = ?, customer_idCard=?, customer_phone=?,customer_email = ?,customer_address=? where customer_id = ?";

    @Override
    public void insertCustomer(Customer customer) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(INSERT_CUSTOMER_SQL);
            statement.setInt(1,customer.getCustomerId());
            statement.setInt(2,customer.getCustomerTypeId());
            statement.setString(3, customer.getCustomerName());
            statement.setString(4, customer.getCustomerBirthday());
            statement.setString(5, customer.getCustomerGender());
            statement.setString(6, customer.getCustomerIDCard());
            statement.setString(7, customer.getCustomerPhone());
            statement.setString(8, customer.getCustomerEmail());
            statement.setString(9, customer.getCustomerAddress());

            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Customer> getAllCustomer() {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Customer> customerList = new ArrayList<>();
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int idCustomer = resultSet.getInt("customer_id") ;
                int idTypeCustomer = resultSet.getInt("customer_type_id");
                String nameCustomer = resultSet.getString("customer_name");
                String birthdayCustomer = resultSet.getString("customer_birthday");
                String genderCustomer = resultSet.getString("customer_gender");
                String IdCardCustomer = resultSet.getString("customer_idcard");
                String PhoneCustomer = resultSet.getString("customer_phone");
                String emailCustomer = resultSet.getString("customer_email");
                String addressCustomer = resultSet.getString("customer_address");
                Customer customer = new Customer(idCustomer, idTypeCustomer,nameCustomer,birthdayCustomer,genderCustomer,IdCardCustomer,PhoneCustomer,emailCustomer,addressCustomer);
                customerList.add(customer);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }

    @Override
    public Customer getCustomerById(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        Customer customer = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int idCustomer = resultSet.getInt("customer_id") ;
                int idTypeCustomer = resultSet.getInt("customer_type_id");
                String nameCustomer = resultSet.getString("customer_name");
                String birthdayCustomer = resultSet.getString("customer_birthday");
                String genderCustomer = resultSet.getString("customer_gender");
                String IdCardCustomer = resultSet.getString("customer_idcard");
                String PhoneCustomer = resultSet.getString("customer_phone");
                String emailCustomer = resultSet.getString("customer_email");
                String addressCustomer = resultSet.getString("customer_address");
                customer = new Customer(idCustomer, idTypeCustomer,nameCustomer,birthdayCustomer,genderCustomer,IdCardCustomer,PhoneCustomer,emailCustomer,addressCustomer);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return customer;
    }

    @Override
    public void updateCustomer(Customer customer) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(UPDATE_CUSTOMER);
            statement.setInt(1, customer.getCustomerTypeId());
            statement.setString(2, customer.getCustomerName());
            statement.setString(3, customer.getCustomerBirthday());
            statement.setString(4, customer.getCustomerGender());
            statement.setString(5, customer.getCustomerIDCard());
            statement.setString(6, customer.getCustomerPhone());
            statement.setString(7, customer.getCustomerEmail());
            statement.setString(8, customer.getCustomerAddress());
            statement.setInt(9, customer.getCustomerId());
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCustomer(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(DELETE_CUSTOMER_BY_ID);
            statement.setInt(1, id);
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
