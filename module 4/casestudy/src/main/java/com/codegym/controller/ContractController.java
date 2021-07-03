package com.codegym.controller;

import com.codegym.model.*;
import com.codegym.repository.ContractDetailsRepository;
import com.codegym.repository.ContractRepository;
import com.codegym.repository.CustomerRepository;
import com.codegym.service.*;
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

@Controller
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private ContractService contractService;

    @Autowired
    private ContractDetailService contractDetailService;

    @Autowired
    private AttachServiceService attachServiceService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private IService service;

    @ModelAttribute("customers")
    public List<Customer> customers(){
        return customerService.findAll();
    }

    @ModelAttribute("employees")
    public List<Employee> employees(){
        return employeeService.findAll();
    }

    @ModelAttribute("services")
    public List<Service> services(){
        return service.findAll();
    }

    @ModelAttribute("attachServices")
    public List<AttachService> attachServices(){
        return attachServiceService.findAll();
    }

    @GetMapping(value = {"","/","/list", "search"})
    public String getAllContract(@PageableDefault(size = 6) Pageable pageable, @RequestParam Optional<String> search,
                                 Model model, RedirectAttributes redirectAttributes) {
        String stringAfterCheck = "";
        if (!search.isPresent()) {
            model.addAttribute("contractList", contractService.findAll(pageable));
        } else {
            stringAfterCheck = search.get();
            model.addAttribute("contractList", contractService.findContractByNameCustomer(stringAfterCheck, pageable));
        }
        model.addAttribute("stringAfterCheck", stringAfterCheck);
        return "contract/list";
    }

    @GetMapping("/create")
    public ModelAndView createContract(){
        return new ModelAndView("contract/create", "contracts", new Contract());
    }

    @PostMapping("/create")
    public String createContractSuccess(Model model, @Validated @ModelAttribute Contract contract, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute(contract);
            return "contract/create";
        }

        contractService.save(contract);
        return "redirect:/contract/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable(value = "id") int id){
        Contract contract = contractService.findById(id);
        return new ModelAndView("contract/edit", "contracts", contract);
    }

    @PostMapping("/edit")
    public String editSuccess(@ModelAttribute Contract contract){
        contractService.save(contract);
        return "redirect:/contract/list";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDelete(@PathVariable(value = "id") int id){
        Contract contract = contractService.findById(id);
        return new ModelAndView("contract/delete", "contracts", contract);
    }

    @PostMapping("/delete/{id}")
    public String deleteSuccess(@PathVariable(value = "id") int id, Pageable pageable, Model model){
        contractService.deleteById(id);
        Page<Contract> contracts = contractService.findAll(pageable);
        model.addAttribute("contracts", contracts);
        return "redirect:/contract/list";
    }

    @GetMapping("/details/{id}")
    public ModelAndView viewContractDetails(@PathVariable(value = "id") int id){
        ContractDetails contractDetails = contractDetailService.findContractDetailsById(id);
        return new ModelAndView("contract/details", "view", contractDetails);
    }

}
