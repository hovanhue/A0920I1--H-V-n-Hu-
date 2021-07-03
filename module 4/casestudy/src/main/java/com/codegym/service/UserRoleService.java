package com.codegym.service;

import com.codegym.model.UserRole;

import java.util.List;

public interface UserRoleService {
    List<UserRole> findAll();

    void save(UserRole userRole);
}
