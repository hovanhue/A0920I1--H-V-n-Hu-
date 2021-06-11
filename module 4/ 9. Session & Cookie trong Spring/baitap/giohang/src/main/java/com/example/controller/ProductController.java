package com.example.controller;

import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ModelAndView getHome(@PageableDefault(value = 5) Pageable pageable){
        return new ModelAndView("product/list", "products", productService.findAll(pageable));
    }

    @GetMapping("/view/{id}")
    public ModelAndView viewProduct(@PathVariable(value = "id") int id){
        return new ModelAndView("product/view", "products", productService.findById(id));
    }

    @GetMapping("/add-to-cart/{id}")
    public ModelAndView addToCart(@PathVariable(value = "id") int id, HttpSession session){

    }

}
