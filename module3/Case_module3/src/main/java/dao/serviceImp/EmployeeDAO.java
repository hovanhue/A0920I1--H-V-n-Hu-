package dao.serviceImp;

import dao.EmployeeImpl;
import model.Employee;
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
    private static final String UPDATE_EMPLOYEE = "Update employee set employee_name = ?, employee_birthday = ?, employee_birthday = ? " +
           "employee_idCard = ? employee_salary = ? employee_phone = ? employee_email = ?   employee_address = ? where employee_id = ?";

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
            statement.setString(9, employee.getEmployeeEducationDegree());
            statement.setString(10, employee.getEmployeePosition());
            statement.setString(11, employee.getEmployeeDivision());
            statement.setString(12, employee.getEmployeeUserName());
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
                String employeeName = rs.getString("name");
                String employeeBirthday = rs.getString("birthday");
                String employeeIDCard = rs.getString("idcard");
                double employeeSalary = rs.getDouble("salary");
                String employeePhone = rs.getString("phone");
                String employeeEmail = rs.getString("email");
                String employeeAddress = rs.getString("address");
                String employeeEducationDegree = rs.getString("educationDegree");
                String employeePosition = rs.getString("position");
                String employeeDivision = rs.getString("division");
                String employeeUserName = rs.getString("username");
                employee = new Employee(id, employeeName, employeeBirthday, employeeIDCard, employeeSalary,employeePhone,employeeEmail,employeeAddress,employeeEducationDegree,employeePosition,employeeDivision,employeeUserName);
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
                int employeeId = resultSet.getInt("id");
                String employeeName = resultSet.getString("name");
                String employeeBirthday = resultSet.getString("birthday");
                String employeeIDCard = resultSet.getString("idcard");
                double employeeSalary = resultSet.getDouble("salary");
                String employeePhone = resultSet.getString("phone");
                String employeeEmail = resultSet.getString("email");
                String employeeAddress = resultSet.getString("address");
                String employeeEducationDegree = resultSet.getString("educationDegree");
                String employeePosition = resultSet.getString("position");
                String employeeDivision = resultSet.getString("division");
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
            statement.setString(8, employee.getEmployeeEducationDegree());
            statement.setString(9, employee.getEmployeePosition());
            statement.setString(10, employee.getEmployeeDivision());
            statement.setString(11, employee.getEmployeeUserName());
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
}
