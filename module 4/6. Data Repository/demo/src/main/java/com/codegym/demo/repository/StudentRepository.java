package com.codegym.demo.repository;

import com.codegym.demo.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Page<Student> findByNameContaining(String name, Pageable pageable);
    Page<Student> findAll(Pageable pageable);

}
