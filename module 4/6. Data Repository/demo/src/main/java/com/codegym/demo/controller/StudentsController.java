package com.codegym.demo.controller;

import com.codegym.demo.model.Student;
import com.codegym.demo.service.CourseService;
import com.codegym.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class StudentsController {

    @Autowired
    StudentService studentService;

    @Autowired
    CourseService courseService;

    @GetMapping("/")
    public ModelAndView getHome(@RequestParam Optional<String> key_search,@PageableDefault(value = 1) Pageable pageable, Model model){
        if(!key_search.isPresent()){
            return new ModelAndView("list", "students", studentService.findAllStudent(pageable));
        }else {
            model.addAttribute("key_search", key_search.get());
            return new ModelAndView("list", "students", studentService.findStudentByName(key_search.get(), pageable));
        }
    }

    @GetMapping("/create")
    public ModelAndView getCreatePage(Model model){
        model.addAttribute("courses", courseService.findAllCourse());
        return new ModelAndView("create", "student", new Student());
    }

    @PostMapping("/create")
    public String saveStudent(Student student){
        studentService.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable int id, Model model){
        model.addAttribute("courses", courseService.findAllCourse());
        model.addAttribute("student", studentService.findStudentById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String updateStudent(Student student){
        studentService.updateStudent(student.getId(),student);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.findStudentById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Student student, RedirectAttributes redirect) {
        studentService.deleteStudentById(student.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/";
    }
}
