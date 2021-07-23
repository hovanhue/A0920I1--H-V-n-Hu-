package com.example.service.impl;

import com.example.model.ProductType;
import com.example.repository.ProductTypeRepository;
import com.example.service.LoaiSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService {
    @Autowired
    private ProductTypeRepository loaiSanPhamRepository;

    @Override
    public List<ProductType> findAll() {
        return loaiSanPhamRepository.findAll();
    }
}
