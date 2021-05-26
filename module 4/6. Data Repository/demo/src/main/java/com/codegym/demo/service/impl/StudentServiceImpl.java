package com.codegym.demo.service.impl;

import com.codegym.demo.model.Student;
import com.codegym.demo.repository.StudentRepository;
import com.codegym.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Page<Student> findAllStudent(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Page<Student> findStudentByName(String name, Pageable pageable) {
        return studentRepository.findByNameContaining(name, pageable);
    }

    @Override
    public void updateStudent(int id, Student student) {
        studentRepository.save(student);
    }

}
