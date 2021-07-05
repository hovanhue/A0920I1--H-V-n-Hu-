package com.codegym.controller;

import com.codegym.model.*;
import com.codegym.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
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
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private UserService userService;

//    @Autowired
//    private UserRoleService userRoleService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private EducationDegreeService educationDegreeService;

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private RoleService roleService;

    @ModelAttribute("positions")
    public List<Position> positions(){
        return positionService.findAll();
    }

    @ModelAttribute("educationDegrees")
    public List<EducationDegree> education_degrees(){
        return educationDegreeService.findAll();
    }

    @ModelAttribute("divisions")
    public List<Division> divisions(){
        return divisionService.findAll();
    }

    @ModelAttribute("roles")
    public List<Role> roles(){
        return roleService.findAll();
    }

    @GetMapping(value = {"","/","/list", "search"})
    public String getAllCustomer(@PageableDefault(size = 6) Pageable pageable, @RequestParam Optional<String> search,
                                 Model model, RedirectAttributes redirectAttributes) {
        String stringAfterCheck = "";
        if (!search.isPresent()) {
            model.addAttribute("employeeList", employeeService.findAllEmployee(pageable));
        } else {
            stringAfterCheck = search.get();
            model.addAttribute("employeeList", employeeService.findEmployeeByNameContaining(stringAfterCheck, pageable));
        }
        model.addAttribute("stringAfterCheck", stringAfterCheck);
        return "employee/list";
    }

    @GetMapping("/create")
    public ModelAndView showCreate(Model model){
        model.addAttribute("userRole", new User());
        return new ModelAndView("employee/create", "employees", new Employee());
    }

    @PostMapping(value = "/create", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String createSuccess(Model model, @Validated @ModelAttribute Employee employee, BindingResult bindingResult,
    @RequestBody List<Object> json) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute(employee);
            return "employee/create";
        }
        User user = (User) json.get(1);
        userService.save(user);

//        UserRole userRole = (UserRole)json.get(0);
//        userRoleService.save(new UserRole(userRole.getUserRoleId(), user.getUsername()));
        employeeService.saveEmployee(employee);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable(value = "id") int id){
        return new ModelAndView("employee/edit", "employee", employeeService.findEmployeeById(id));
    }

    @PostMapping("/edit")
    public String editSuccess(@ModelAttribute Employee employee,Model model){
//        model.addAttribute("userRole", userRole);
        employeeService.saveEmployee(employee);
        return "redirect:/employee/list";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDelete(@PathVariable(value = "id") int id){
        return new ModelAndView("employee/delete", "employee", employeeService.findEmployeeById(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteSuccess(@PathVariable(value = "id") int id, Pageable pageable, Model model){
        employeeService.deleteEmployeeById(id);
        Page<Employee> employees = employeeService.findAllEmployee(pageable);
        model.addAttribute("employees", employees);
        return "redirect:/employee/list";
    }
}
