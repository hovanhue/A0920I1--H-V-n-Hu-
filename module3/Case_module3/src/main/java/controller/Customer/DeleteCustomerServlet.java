package controller;

import dao.CustomerImpl;
import dao.EmployeeImpl;
import dao.serviceImp.CustomerDAO;
import dao.serviceImp.EmployeeDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteCustomerServlet", value = "/deleteC")
public class DeleteCustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        CustomerImpl customer = new CustomerDAO();
        customer.deleteCustomer(id);
        response.sendRedirect("/listC");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
