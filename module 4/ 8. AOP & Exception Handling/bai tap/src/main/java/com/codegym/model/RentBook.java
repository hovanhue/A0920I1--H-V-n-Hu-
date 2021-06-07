package com.codegym.model;

import javax.persistence.*;

@Entity
public class RentBook {
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Book book;

    public RentBook() {
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
