package controller;

import dao.EmployeeImpl;
import dao.serviceImp.EmployeeDAO;
import model.Employee;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "CreateEmplyeeServlet", value = "/save")
public class CreateEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("customer/jsp/createEmployee.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("id"));
        String employeeName  = request.getParameter("name");
        String employeeBirthday = request.getParameter("birthday");
        String employeeIDCard = request.getParameter("idcard");
        double employeeSalary = Double.parseDouble(request.getParameter("salary"));
        String employeePhone = request.getParameter("phone");
        String employeeEmail = request.getParameter("email");
        String employeeAddress = request.getParameter("address");
        String employeeEducationDegree = request.getParameter("educationDegree");
        String employeePosition = request.getParameter("position");
        String employeeDivision = request.getParameter("division");
        String employeeUserName = request.getParameter("username");

        Employee employee = new Employee(employeeId, employeeName,employeeBirthday,employeeIDCard,employeeSalary,employeePhone,employeeEmail,employeeAddress,employeeEducationDegree,employeePosition,employeeDivision,employeeUserName);
        EmployeeImpl employee1 = new EmployeeDAO();
        employee1.insertEmployee(employee);
        response.sendRedirect("list");
    }
}
