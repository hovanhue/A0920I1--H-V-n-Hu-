package com.codegym.repository;

import com.codegym.model.RentBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentBookRepository extends JpaRepository<RentBook, Integer> {
}
