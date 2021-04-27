package controller;

import dao.CustomerImpl;
import dao.serviceImp.CustomerDAO;
import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateCustomerServlet", value = "/createC")
public class CreateCustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/jsp/CreateCustomer.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("idCustomer"));
        int customerIdType = Integer.parseInt(request.getParameter("idCustomerType"));
        String customerName  = request.getParameter("nameCustomer");
        String customerBirthday = request.getParameter("birthdayCustomer");
        String customerGender =  request.getParameter("genderCustomer");
        String customerIDCard = request.getParameter("idcardCustomer");
        String customerPhone = request.getParameter("phoneCustomer");
        String customerEmail = request.getParameter("emailCustomer");
        String customerAddress = request.getParameter("addressCustomer");

        Customer customer = new Customer(customerId, customerIdType,customerName, customerBirthday,customerGender,customerIDCard,customerPhone,customerEmail,customerAddress);
        CustomerImpl customer1 = new CustomerDAO();
        customer1.insertCustomer(customer);
        response.sendRedirect("listC");
    }
}
