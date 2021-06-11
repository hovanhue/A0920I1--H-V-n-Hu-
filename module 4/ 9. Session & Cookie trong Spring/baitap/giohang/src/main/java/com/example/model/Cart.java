package com.example.model;

import javax.persistence.*;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "idProduct")
    private Product product;
    private int quantityCart;

    public Cart() {
    }

    public Cart(Product product, int quantity) {
        this.product = product;
        this.quantityCart = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantityCart;
    }

    public void setQuantity(int quantity) {
        this.quantityCart = quantity;
    }
}
