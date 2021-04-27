package controller;

import dao.CustomerImpl;
import dao.serviceImp.CustomerDAO;
import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListCustomerServlet", value = "/listC")
public class ListCustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerImpl customer = new CustomerDAO();
        List<Customer> customersList = customer.getAllCustomer();
        request.setAttribute("listCustomer", customersList);
        request.getRequestDispatcher("/view/jsp/ListCustomer.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
