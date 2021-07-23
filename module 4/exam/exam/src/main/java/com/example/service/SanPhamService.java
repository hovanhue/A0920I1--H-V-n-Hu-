package com.example.service;

import com.example.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SanPhamService {
    Page<Product> findAllSanPham(Pageable pageable);
    Product findSanPhamById(int id);
    void saveSanPham(Product sanPham);
    void deleteSanPhamById(int id);

    Page<Product> findSanPhamByNameContaining(String name, Pageable pageable);
}
