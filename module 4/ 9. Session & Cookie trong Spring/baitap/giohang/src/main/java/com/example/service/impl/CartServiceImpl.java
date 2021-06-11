package com.example.service.impl;

import com.example.model.Cart;
import com.example.service.CartService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Override
    public Page<Cart> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Cart findById(int id) {
        return null;
    }

    @Override
    public void save(Cart product) {

    }

    @Override
    public void deleteById(int id) {

    }
}
