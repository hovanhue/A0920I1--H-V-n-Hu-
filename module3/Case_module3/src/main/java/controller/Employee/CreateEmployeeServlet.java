package controller;

import dao.EmployeeImpl;
import dao.serviceImp.EmployeeDAO;
import model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateEmplyeeServlet", value = "/createE")
public class CreateEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/jsp/CreateEmployee.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("idEmployee"));
        String employeeName  = request.getParameter("nameEmployee");
        String employeeBirthday = request.getParameter("birthdayEmployee");
        String employeeIDCard = request.getParameter("idcardEmployee");
        double employeeSalary = Double.parseDouble(request.getParameter("salaryEmployee"));
        String employeePhone = request.getParameter("phoneEmployee");
        String employeeEmail = request.getParameter("emailEmployee");
        String employeeAddress = request.getParameter("addressEmployee");
        int employeeEducationDegree = Integer.parseInt(request.getParameter("educationDegreeEmployee"));
        int employeePosition = Integer.parseInt(request.getParameter("positionEmployee"));
        int employeeDivision = Integer.parseInt(request.getParameter("divisionEmployee"));
        String employeeUserName = request.getParameter("usernameEmployee");

        Employee employee = new Employee(employeeId, employeeName,employeeBirthday,employeeIDCard,employeeSalary,employeePhone,employeeEmail,employeeAddress,employeeEducationDegree,employeePosition,employeeDivision,employeeUserName);
        EmployeeImpl employee1 = new EmployeeDAO();
        employee1.insertEmployee(employee);
        response.sendRedirect("listE");
    }
}
