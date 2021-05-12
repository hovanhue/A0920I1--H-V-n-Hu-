package controller.Employee;

import dao.EmployeeImpl;
import dao.serviceImp.EmployeeDAO;
import model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListEmployeeServlet", value = "/listE")
public class ListEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeeImpl employee = new EmployeeDAO();
        List<Employee> list = employee.getAllEmployee();
        request.setAttribute("listEmployee", list);
        request.getRequestDispatcher("/view/jsp/listEmplyee.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
