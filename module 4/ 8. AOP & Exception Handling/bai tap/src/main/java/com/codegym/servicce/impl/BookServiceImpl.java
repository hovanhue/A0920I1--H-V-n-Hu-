package com.codegym.servicce.impl;

import com.codegym.exception.RentBookException;
import com.codegym.model.Book;
import com.codegym.model.RentBook;
import com.codegym.repository.BookRepository;
import com.codegym.repository.RentBookRepository;
import com.codegym.servicce.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    RentBookRepository rentBookRepository;

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void removeById(Integer id) {
        bookRepository.deleteById(id);
    }

    @Override
    public double borrowBook(Book book) throws RentBookException {
        RentBook rentBook = new RentBook();
        assert false;
        long idRentBook = (long) (10000L +  (Math.random()*(9999L-10000L)));

        rentBook.setId((int) idRentBook);     // set id rent
        rentBook.setBook(book);  // set book for rent
        rentBookRepository.save(rentBook);
        decreaseAmount(book);

        return idRentBook;
    }

    @Override
    public boolean giveBookBack(RentBook rentBook) throws RentBookException {
        Book book;
        rentBook = rentBookRepository.findById((int) rentBook.getId()).orElse(null);
        if (rentBook==null){
            return false;
        }else {
            book = bookRepository.findById(rentBook.getBook().getId()).orElse(null);
            assert book != null;
            System.out.println(book.getTitle());
            increaseAmount(book);
        }
        bookRepository.save(book);
        rentBookRepository.delete(rentBook);
        return true;
    }

    @Override
    public void decreaseAmount(Book book) throws RentBookException {
        int amount = 0;
        int sl = 0;
        if (book.getAmount() < 1) {
            throw new RentBookException();
        } else {
            amount = (int) (book.getAmount() - 1);
            book.setAmount(amount);
            sl = book.getQuantity() + 1;
            book.setQuantity(sl);
        }

        bookRepository.save(book);
    }

    @Override
    public void increaseAmount(Book book) throws RentBookException {
        int amount = (int)book.getAmount() + 1;
        book.setAmount(amount);

        int remainAmount = book.getQuantity() - 1;
        book.setQuantity(remainAmount);

        bookRepository.save(book);
    }
}
