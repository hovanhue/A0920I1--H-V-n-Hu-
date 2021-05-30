package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BloService bloService;

    @GetMapping("/")
    public ModelAndView getHome(@RequestParam Optional<String> key_search, @PageableDefault(value = 5)Pageable pageable, Model model){
        if(!key_search.isPresent()){
            return new ModelAndView("list", "blogs", bloService.findAll(pageable));
        }
        else {
            model.addAttribute("key_seach", key_search.get());
            return new ModelAndView("list", "blogs", bloService.findByContentContaining(key_search.get(), pageable));
        }
    }

    @GetMapping("/create")
    public ModelAndView createBlog(){
        return new ModelAndView("create", "blogs", new Blog());
    }

    @PostMapping("/save")
    public String saveBlogs(Blog  blog){
        bloService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView changBlogs(@PathVariable(value = "id") int id){
        return new ModelAndView("edit", "blog", bloService.findBlogById(id));
    }

    @PostMapping("/edit")
    public String updateBlogs(Blog blog){
        bloService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteBlog(@PathVariable(value = "id") int id){
        bloService.delete(id);
        return "redirect:/";
    }
}
