package com.codegym.service;

import com.codegym.model.RentBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface RentBookService {
    Page<RentBook> findAll(Pageable pageable) ;
    RentBook findById(Integer id) ;

    void save (RentBook rentBook);

    void removeById (Integer id);
}
