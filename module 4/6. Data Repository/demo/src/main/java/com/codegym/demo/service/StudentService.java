package com.codegym.demo.service;

import com.codegym.demo.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
    Page<Student> findAllStudent(Pageable pageable);
    Student findStudentById(int id);
    void saveStudent(Student student);
    void deleteStudentById(int id);
    Page<Student> findStudentByName(String name, Pageable pageable);
    void updateStudent(int id, Student student);

}
