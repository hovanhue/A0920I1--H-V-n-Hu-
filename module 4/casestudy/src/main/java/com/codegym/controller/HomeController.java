package com.codegym.controller;

import com.codegym.dto.UserDto;
import com.codegym.model.Role;
import com.codegym.model.User;
import com.codegym.service.RoleService;
import com.codegym.service.UserService;
import com.codegym.util.EncrypPasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.HashSet;
import java.util.Set;

@Controller
//@SessionAttributes("")
//@RequestMapping("/home")
public class HomeController {
    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @GetMapping("/login")
    public String showLogin(){
        return "home/login";
    }

    @GetMapping("/admin")
    public String getHomeAdmin(){
        return "home/admin";
    }

//    @GetMapping("/user")

    @GetMapping("/")
    public String getHome(){
        return "home/index";
    }

    @GetMapping("/register")
    public ModelAndView getRegisterPage(){
        return new ModelAndView("home/register","registerUser",new UserDto());
    }

    @PostMapping("/register")
    public String registerUser(@Validated @ModelAttribute("registerUser") UserDto registerUser, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "home/register";
        }else {
            User user = new User();
            user.setUsername(registerUser.getUsername());
            user.setPassword(EncrypPasswordUtils.EncrypPasswordUtils(registerUser.getPassword()));
            user.setRememberToken(EncrypPasswordUtils.EncrypPasswordUtils(registerUser.getPassword()));
            Role roleEntity = roleService.findByName("ROLE_MEMBER");
            Set<Role> listRoles = new HashSet<>();
            listRoles.add(roleEntity);
            user.setRoles(listRoles);
            userService.save(user);
            return "redirect:/login";
        }
    }


    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {
        return "home/403";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
            Cookie cookie = new Cookie("remember-me", "");
            cookie.setMaxAge(24*60*60*1);
            response.addCookie(cookie);
        }
        return "redirect:/login";
    }
}
