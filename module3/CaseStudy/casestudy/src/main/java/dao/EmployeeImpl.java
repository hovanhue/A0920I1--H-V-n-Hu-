package dao;

import model.Employee;

import java.util.List;

public interface EmployeeImpl {
    void insertEmployee(Employee employee);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployee();
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
