package com.codegym.servicce;

import com.codegym.exception.RentBookException;
import com.codegym.model.Book;
import com.codegym.model.RentBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
    Page<Book> findAll(Pageable pageable) ;

    Book findById(Integer id) ;
    void save (Book book);
    void removeById (Integer id);
    double borrowBook(Book book) throws RentBookException, RentBookException;
    boolean giveBookBack(RentBook rentBook) throws RentBookException;
    void decreaseAmount(Book book) throws RentBookException;
    void increaseAmount(Book book) throws RentBookException;
}
