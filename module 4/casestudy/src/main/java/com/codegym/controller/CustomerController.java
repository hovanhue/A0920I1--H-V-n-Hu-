package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.model.CustomerType;
import com.codegym.service.CustomerService;
import com.codegym.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

/*
chưa sử dụng session cookie
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @ModelAttribute("customertypes")
    public List<CustomerType> customerTypes(){
        return customerTypeService.findAll();
    }

    @GetMapping(value = {"","/","/list", "search"})
    public String getAllCustomer(@PageableDefault(size = 6) Pageable pageable, @RequestParam Optional<String> search,
                                 Model model, RedirectAttributes redirectAttributes) {
        String stringAfterCheck = "";
        if (!search.isPresent()) {
            model.addAttribute("customerList", customerService.findAllCustomer(pageable));
        } else {
            stringAfterCheck = search.get();
            model.addAttribute("customerList", customerService.findCustomerByNameContaining(stringAfterCheck, pageable));
        }
        model.addAttribute("stringAfterCheck", stringAfterCheck);
        return "customer/list";
    }

    @GetMapping("/create")
    public ModelAndView createCustomer(){
        return new ModelAndView("customer/create", "customers", new Customer());
    }

    @PostMapping("/create")
    public String createCustomerSuccess(Model model, @Validated @ModelAttribute Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute(customer);
            return "customer/create";
        }
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable(value = "id") int id){
        Customer customer = customerService.findCustomerById(id);
        return new ModelAndView("customer/edit", "customer", customer);
    }

    @PostMapping("/edit")
    public String editSuccess(@ModelAttribute Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDelete(@PathVariable(value = "id") int id){
        Customer customer = customerService.findCustomerById(id);
        return new ModelAndView("customer/delete", "customer", customer);
    }

    @PostMapping("/delete/{id}")
    public String deleteSuccess(@PathVariable(value = "id") int id, Pageable pageable, Model model){
        customerService.deleteCustomerById(id);
        Page<Customer> customerPage = customerService.findAllCustomer(pageable);
        model.addAttribute("customers", customerPage);
        return "redirect:/customer/list";
    }
}
