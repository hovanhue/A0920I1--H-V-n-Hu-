package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BloService {
    Page<Blog> findAll(Pageable pageable);
    Blog findBlogById(int id);
    void save(Blog blog);
    void delete(int id);

    Page<Blog> findByContentContaining(String contents, Pageable pageable);
}
