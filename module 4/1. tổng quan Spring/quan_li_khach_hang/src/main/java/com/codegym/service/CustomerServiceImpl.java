package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codegym.reponsitory.CustomerReponsitory;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerReponsitory customerReponsitory;

    @Override
    public List<Customer> finAll() {
        return customerReponsitory.finAll();
    }

    @Override
    public Customer findById(int id) {
        return customerReponsitory.findById(id);
    }

    @Override
    public void deleteById(int id) {
        customerReponsitory.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
        customerReponsitory.save(customer);
    }
}
