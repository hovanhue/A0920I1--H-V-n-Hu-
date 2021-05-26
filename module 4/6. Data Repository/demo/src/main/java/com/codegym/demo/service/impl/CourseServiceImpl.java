package com.codegym.demo.service.impl;

import com.codegym.demo.model.Course;
import com.codegym.demo.repository.CourseRepository;
import com.codegym.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Override
    public List<Course> findAllCourse() {
        return courseRepository.findAll();
    }
}
