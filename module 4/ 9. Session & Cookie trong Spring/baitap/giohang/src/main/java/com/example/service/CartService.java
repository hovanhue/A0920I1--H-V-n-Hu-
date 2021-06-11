package com.example.service;

import com.example.model.Cart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CartService {
    Page<Cart> findAll(Pageable pageable);
    Cart findById(int id);
    void save(Cart product);
    void deleteById(int id);
}
