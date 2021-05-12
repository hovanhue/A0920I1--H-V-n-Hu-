package dao;

import model.*;

import java.util.List;

public interface EmployeeImpl {
    void insertEmployee(Employee employee);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployee();
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);

    Position getPosition(int id);
    EducationDegree getEducationDegree(int id);
    Division getDivision(int id);
    void insertUser(User user);
    void insertUserRole(UserRole userRole);
}
