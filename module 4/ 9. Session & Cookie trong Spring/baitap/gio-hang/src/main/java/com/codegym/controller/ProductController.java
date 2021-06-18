package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;

@Controller
@RequestMapping("/product")
@SessionAttributes("carts")
public class ProductController {

    @Autowired
    ProductService productService;

    @ModelAttribute("carts")
    public HashMap<Long, Cart> getShowInfo(){
        return new HashMap<>();
    }

    @GetMapping("/list")
    public ModelAndView showList(){
        return new ModelAndView("list", "products", productService.findAll());
    }

    @GetMapping("/create-product")
    public ModelAndView showFormCreate(){
        return new ModelAndView("create", "product", new Product());
    }

    @PostMapping("/create-product")
    public String saveProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addAttribute("message","New product created successfully");
        return "redirect:/product/list";
    }

    @GetMapping("/view-product/{id}")
    public String viewProduct(@PathVariable(value = "id") Long id, Model model, @ModelAttribute("carts") HashMap<Long, Cart> cartHashMap){
        Product product = productService.findById(id);
        model.addAttribute("carts", cartHashMap);
        model.addAttribute("product",product);
        return "view";
    }

    @GetMapping("/delete-product/{id}")
    public String showDeleteProduct(@PathVariable(value = "id") Long id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "delete";
    }

    @PostMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable(value = "id")Long id, @ModelAttribute Product product){
        productService.deleteById(id);
        return "redirect:/product/list";
    }
}
