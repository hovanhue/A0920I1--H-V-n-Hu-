package com.example.service;

import com.example.model.Cart;
import com.example.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);
    Product findById(int id);
    void save(Product product);
    void deleteById(int id);

    double totalPrice(Cart cart);
    boolean giveProductBack(Cart cart);
    void decreaseAmount(Product product) throws Exception;
    void increaseAmount(Product product);
}
