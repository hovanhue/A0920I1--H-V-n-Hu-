package com.codegym.controller;

import com.codegym.dto.UserDto;
import com.codegym.model.Role;
import com.codegym.model.User;
import com.codegym.service.RoleService;
import com.codegym.service.UserService;
import com.codegym.util.EncrypPasswordUtils;
import com.codegym.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.Authentication;

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

    @GetMapping("/")
    public String loginSuccess(){
        return "home/index";
    }

    @GetMapping("/register")
    public String showRegister(@Validated @ModelAttribute("registerUser") UserDto registerUser, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "home/register";
        }else{
            User user = new User();
            user.setUsername(registerUser.getEmail());
            user.setPassword(EncrypPasswordUtils.EncrypPasswordUtils(registerUser.getPassword()));
            Role role = new Role("ROLE_USER");
            Set<Role> listRole = new HashSet<>();
            listRole.add(role);
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
