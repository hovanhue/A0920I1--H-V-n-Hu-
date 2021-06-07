package com.codegym.servicce.impl;

import com.codegym.model.RentBook;
import com.codegym.repository.RentBookRepository;
import com.codegym.servicce.RentBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RentBookServiceImpl implements RentBookService {

    @Autowired
    RentBookRepository rentBookRepository;

    @Override
    public Page<RentBook> findAll(Pageable pageable) {
        return rentBookRepository.findAll(pageable);
    }

    @Override
    public RentBook findById(Integer id) {
        return rentBookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(RentBook rentBook) {
        rentBookRepository.save(rentBook);
    }

    @Override
    public void removeById(Integer id) {
        rentBookRepository.deleteById(id);
    }
}
