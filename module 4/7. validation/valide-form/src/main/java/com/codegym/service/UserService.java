package com.codegym.service;

import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<User> findAll(Pageable pageable);
    User findUserById(Integer id);
    void save(User user);
    void remove(int id);

    Page<User> findByFirstNameContaining(String name, Pageable pageable);
}
