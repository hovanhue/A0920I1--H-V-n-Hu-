package com.codegym.service;

import com.codegym.exception.NotAvailableException;
import com.codegym.exception.WrongCodeException;
import com.codegym.model.Book;
import com.codegym.model.Code;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface Bookservice {
    Page<Book> findAll(Pageable pageable);

    void save(Book book);

    Book findById(Integer id);

    void borrow(Book book, Integer usedCode);

    void delete(Integer id);

    Code getNextAvailableCode(Book book) throws NotAvailableException;

    void returnBook(Book book, Integer returnCode) throws NotAvailableException, WrongCodeException;

    public boolean checkNoUsedCode(Book book);
}
