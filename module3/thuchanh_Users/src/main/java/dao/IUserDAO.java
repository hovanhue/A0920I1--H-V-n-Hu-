package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user);
    public User selectUser(int id);
    public List<User> selectAllUsers();
    public boolean deleteUser(int id);
    public boolean updateUser(User user);
    public User getUserById(int id);
    public void findByCountry();
    public void sortByName();

    public void insertUserStore(User user) throws SQLException;
    public void addUserTransaction(User user, int[] permision);
    public void insertUpdateWithoutTransaction();
    public void insertUpdateUseTransaction();
    public void getAllUserTransaction();
    public void editUserByIDTransaction(User user);
    public void deleteUserTransaction(int id);
}
