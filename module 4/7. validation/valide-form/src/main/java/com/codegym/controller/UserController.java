package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public ModelAndView getHome(@RequestParam Optional<String> key_search, @PageableDefault(value = 5)Pageable pageable, Model model){
        if(!key_search.isPresent()){
            return new ModelAndView("list","users",userService.findAll(pageable));
        }
        else {
            model.addAttribute("key_search", key_search.get());
            return new ModelAndView("list", "users", userService.findByFirstNameContaining(key_search.get(),pageable));
        }
    }

    @GetMapping("/create")
    public ModelAndView createBlog(){
        return new ModelAndView("create", "users", new User());
    }

    @PostMapping("/save")
    public String saveUser(@Validated @ModelAttribute("users") User  user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "/create";
        }
        userService.save(user);
        return "/result";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView changUsers(@PathVariable(value = "id") int id){
        return new ModelAndView("edit", "user", userService.findUserById(id));
    }

    @PostMapping("/edit")
    public String updateBlogs(User user){
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteUsers(@PathVariable(value = "id") int id){
        userService.remove(id);
        return "redirect:/";
    }
}
