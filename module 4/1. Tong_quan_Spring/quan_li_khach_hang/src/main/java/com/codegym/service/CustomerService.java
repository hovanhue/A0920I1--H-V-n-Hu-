package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> finAll();
    Customer findById(int id);
    void deleteById(int id);
    void save(Customer customer);
}
