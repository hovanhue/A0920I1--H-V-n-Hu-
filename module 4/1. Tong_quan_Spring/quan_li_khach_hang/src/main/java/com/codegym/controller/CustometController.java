package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CustometController {

//    CustomerService customerService = new CustomerServiceImpl();
    @Autowired
CustomerService customerService;

    @GetMapping("/list")
    public ModelAndView showList(Model model){
        return new ModelAndView("/list", "listCus", customerService.finAll());
    }

    @GetMapping("/create")
    public String createCustomer(){
        return "/create";
    }
    @PostMapping("/create")
    public String saveCustomer(@RequestParam int id,
                               @RequestParam String name, @RequestParam String  email, @RequestParam String address){
        Customer customer = new Customer(id, name, email, address);
        customerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        customerService.deleteById(id);
        return "redirect:/list";
    }

}
