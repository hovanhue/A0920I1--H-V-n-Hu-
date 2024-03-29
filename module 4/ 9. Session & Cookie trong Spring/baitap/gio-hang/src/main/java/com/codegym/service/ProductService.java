package com.codegym.service;

import com.codegym.model.Product;

public interface ProductService {
    Iterable<Product> findAll();
    Product findById(Long id);
    void save(Product product);
    void deleteById(Long id);

//    void findProductByNameContaining(String name);
}
