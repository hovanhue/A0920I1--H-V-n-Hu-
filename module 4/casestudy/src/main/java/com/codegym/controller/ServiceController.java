package com.codegym.controller;

import com.codegym.model.RentType;
import com.codegym.model.Service;
import com.codegym.model.ServiceType;
import com.codegym.service.IService;
import com.codegym.service.RentTypeService;
import com.codegym.service.ServiceTypeService;
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
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private IService service;

    @Autowired
    private RentTypeService rentTypeService;

    @Autowired
    private ServiceTypeService serviceTypeService;

    @ModelAttribute("rentTypes")
    public List<RentType> rentTypeList(){
        return rentTypeService.findAll();
    }

    @ModelAttribute("serviceTypes")
    public List<ServiceType> serviceTypes(){
        return serviceTypeService.findAll();
    }

    @GetMapping(value = {"","/","/list", "search"})
    public String getAllCustomer(@PageableDefault(size = 6) Pageable pageable, @RequestParam Optional<String> search,
                                 Model model, RedirectAttributes redirectAttributes) {
        String stringAfterCheck = "";
        if (!search.isPresent()) {
            model.addAttribute("serviceList", service.findAllService(pageable));
        } else {
            stringAfterCheck = search.get();
            model.addAttribute("serviceList", service.findServiceByNameContaining(stringAfterCheck, pageable));
        }
        model.addAttribute("stringAfterCheck", stringAfterCheck);
        return "service/list";
    }

    @GetMapping("/create")
    public ModelAndView create(){
        return new ModelAndView("service/create", "services", new Service());
    }

    @PostMapping("/create")
    public String createSuccess(Model model, @Validated @ModelAttribute Service services, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute(services);
            return "service/create";
        }
        service.saveService(services);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable(value = "id") int id){
        Service service1 = service.findServiceById(id);
        return new ModelAndView("service/edit", "service", service1);
    }

    @PostMapping("/edit")
    public String editSuccess(@ModelAttribute Service servic){
        service.saveService(servic);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDelete(@PathVariable(value = "id") int id){
        Service service1 = service.findServiceById(id);
        return new ModelAndView("service/delete", "service", service1);
    }

    @PostMapping("/delete/{id}")
    public String deleteSuccess(@PathVariable(value = "id") int id, Pageable pageable, Model model){
        service.deleteServiceById(id);
        Page<Service> services = service.findAllService(pageable);
        model.addAttribute("services", services);
        return "redirect:/";
    }
}
