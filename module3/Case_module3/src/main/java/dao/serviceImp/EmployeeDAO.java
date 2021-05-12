package dao.serviceImp;

import dao.EmployeeImpl;
import model.*;
import ultils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements EmployeeImpl {
    private static final String INSERT_EMPLOYEE_SQL = "insert into employee values (?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SELECT_EMPLOYEE_BY_ID = "Select * from employee where employee_id = ?";
    private static final String SELECT_ALL_EMPLOYEE = "Select * from employee";
    private static final String DELETE_EMPLOYEE_BY_ID = "Delete from employee where employee_id = ?";
    private static final String UPDATE_EMPLOYEE = "Update employee set employee_name = ?, employee_birthday = ?," +
           "employee_idCard = ?, employee_salary = ?, employee_phone = ?, employee_email = ?, employee_address = ?," +
            "postion_id = ?, education_degree_id = ?, division_id = ?, username= ? where employee_id = ?";

    @Override
    public void insertEmployee(Employee employee) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(INSERT_EMPLOYEE_SQL);
            statement.setInt(1, employee.getEmployeeId());
            statement.setString(2, employee.getEmployeeName());
            statement.setString(3, employee.getEmployeeBirthday());
            statement.setString(4, employee.getEmployeeIDCard());
            statement.setDouble(5, employee.getEmployeeSalary());
            statement.setString(6, employee.getEmployeePhone());
            statement.setString(7, employee.getEmployeeEmail());
            statement.setString(8, employee.getEmployeeAddress());
            statement.setInt(9, employee.getEmployeePosition());
            statement.setInt(10, employee.getEmployeeEducationDegree());
            statement.setInt(11, employee.getEmployeeDivision());
            statement.setString(12, employee.getUserName());
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
    public Employee getEmployeeById(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        Employee employee = null;
        try{
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                String employeeName = rs.getString("employee_name");
                String employeeBirthday = rs.getString("employee_birthday");
                String employeeIDCard = rs.getString("employee_idcard");
                double employeeSalary = rs.getDouble("employee_salary");
                String employeePhone = rs.getString("employee_phone");
                String employeeEmail = rs.getString("employee_email");
                String employeeAddress = rs.getString("employee_address");
                int employeeEducationDegree = rs.getInt("education_Degree_id");
                int employeePosition = rs.getInt("postion_id");
                int employeeDivision = rs.getInt("division_id");
                String employeeUserName = rs.getString("username");
                employee = new Employee(id, employeeName, employeeBirthday, employeeIDCard, employeeSalary,employeePhone,employeeEmail,employeeAddress,employeePosition,employeeEducationDegree,employeeDivision,employeeUserName);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Employee> employeeList = new ArrayList<>();
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int employeeId = resultSet.getInt("employee_id");
                String employeeName = resultSet.getString("employee_name");
                String employeeBirthday = resultSet.getString("employee_birthday");
                String employeeIDCard = resultSet.getString("employee_idcard");
                double employeeSalary = resultSet.getDouble("employee_salary");
                String employeePhone = resultSet.getString("employee_phone");
                String employeeEmail = resultSet.getString("employee_email");
                String employeeAddress = resultSet.getString("employee_address");
                int employeeEducationDegree = resultSet.getInt("education_Degree_id");
                int employeePosition = resultSet.getInt("postion_id");
                int employeeDivision = resultSet.getInt("division_id");
                String employeeUserName = resultSet.getString("username");
                Employee employee = new Employee(employeeId, employeeName, employeeBirthday, employeeIDCard,employeeSalary,employeePhone,employeeEmail,employeeAddress,employeeEducationDegree,employeePosition,employeeDivision,employeeUserName);
                employeeList.add(employee);
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
        return employeeList;
    }

    @Override
    public void updateEmployee(Employee employee) {
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(UPDATE_EMPLOYEE);
            statement.setString(1, employee.getEmployeeName());
            statement.setString(2, employee.getEmployeeBirthday());
            statement.setString(3, employee.getEmployeeIDCard());
            statement.setDouble(4, employee.getEmployeeSalary());
            statement.setString(5, employee.getEmployeePhone());
            statement.setString(6, employee.getEmployeeEmail());
            statement.setString(7, employee.getEmployeeAddress());
            statement.setInt(8, employee.getEmployeeEducationDegree());
            statement.setInt(9, employee.getEmployeePosition());
            statement.setInt(10, employee.getEmployeeDivision());
            statement.setString(11, employee.getUserName());
            statement.setInt(12, employee.getEmployeeId());

            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(DELETE_EMPLOYEE_BY_ID);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Position getPosition(int id) {
        return null;
    }

    @Override
    public EducationDegree getEducationDegree(int id) {
        return null;
    }

    @Override
    public Division getDivision(int id) {
        return null;
    }

    @Override
    public void insertUser(User user) {

    }

    @Override
    public void insertUserRole(UserRole userRole) {

    }


}
