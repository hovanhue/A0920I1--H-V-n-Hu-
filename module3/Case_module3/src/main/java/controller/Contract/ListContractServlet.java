package controller.Contract;

import dao.ContractImpl;
import dao.serviceImp.ContractDAO;
import model.Contract;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListContractServlet", value = "/listCt")
public class ListContractServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContractImpl contract = new ContractDAO();
        List<Contract> contractList = contract.getAllContract();
        request.setAttribute("listContract", contractList);
        request.getRequestDispatcher("/view/jsp/ListContract.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
