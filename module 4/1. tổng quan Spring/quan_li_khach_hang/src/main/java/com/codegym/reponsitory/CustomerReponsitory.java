package com.codegym.reponsitory;

import com.codegym.model.Customer;
import java.util.List;

public interface CustomerReponsitory {
    List<Customer> finAll();
    Customer findById(int id);
    void deleteById(int id);
    void save(Customer customer);
}
