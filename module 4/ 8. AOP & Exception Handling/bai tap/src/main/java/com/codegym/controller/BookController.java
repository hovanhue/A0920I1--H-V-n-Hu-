package com.codegym.controller;

import com.codegym.exception.RentBookException;
import com.codegym.model.Book;
import com.codegym.model.RentBook;
import com.codegym.service.BookService;
import com.codegym.service.RentBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @Autowired
    RentBookService rentBookService;

    @GetMapping("/")
    public ModelAndView getHome(@PageableDefault(value = 5)Pageable pageable){
        return new ModelAndView("book/list", "books", bookService.findAll(pageable));
    }

    @GetMapping("/borrow-book-form/{id}")
    public ModelAndView rentBookForm(@PathVariable(value = "id") Integer id){
        return new ModelAndView("rentBook/rentBook","book" ,bookService.findById(id));
    }

    @PostMapping("/borrow-book")
    public ModelAndView rentBook(Book book) throws RentBookException {
        double idBorrow = bookService.borrowBook(book);
        return new ModelAndView("rentBook/borrowSuccess","idBorrow",idBorrow);
    }

    @GetMapping("/give-book-form")
    public ModelAndView giveBookForm(){
        return new ModelAndView("rentBook/giveBook","rentBook", new RentBook());
    }

    @PostMapping("/give-book-back")
    public ModelAndView giveBook(@ModelAttribute("rentBook") RentBook rentBook) throws RentBookException {
        if (!bookService.giveBookBack(rentBook)){
            return new ModelAndView("rentBook/giveBook","message","Rental id Not Found");
        }
        return new ModelAndView("rentBook/giveBookSuccess");
    }

    @ExceptionHandler(RentBookException.class)
    public ModelAndView showError(){
        return new ModelAndView("rentBook/error");
    }
}
