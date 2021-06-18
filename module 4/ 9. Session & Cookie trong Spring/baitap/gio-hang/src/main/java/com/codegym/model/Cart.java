package com.codegym.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cart {
    @Id
    private Long idCard;

    @ManyToOne
    @JoinColumn(name = "idProduct")
    private Product product;
    private int quantity;

    public Cart(){

    }

    public Cart(Long idCard, Product product, int quantity) {
        this.idCard = idCard;
        this.product = product;
        this.quantity = quantity;
    }

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
