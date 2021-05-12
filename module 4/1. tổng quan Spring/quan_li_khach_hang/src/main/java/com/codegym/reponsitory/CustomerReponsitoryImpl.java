package com.codegym.reponsitory;

import com.codegym.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerReponsitoryImpl implements CustomerReponsitory{
    private static Map<Integer, Customer> listCus;
    static {
        listCus = new HashMap<>();
        listCus.put(1, new Customer(1, "Ho Van Hue1", "hovanhue@gmail.oom", "Quang Nam"));
        listCus.put(2, new Customer(2, "Ho Van Hue2", "hovanhue@gmail.oom", "Quang Nam"));
        listCus.put(3, new Customer(3, "Ho Van Hue3", "hovanhue@gmail.oom", "Quang Nam"));
        listCus.put(4, new Customer(4, "Ho Van Hue4", "hovanhue@gmail.oom", "Quang Nam"));
        listCus.put(5, new Customer(5, "Ho Van Hue5", "hovanhue@gmail.oom", "Quang Nam"));
    }


    @Override
    public List<Customer> finAll() {
        return new ArrayList<>(listCus.values());
    }

    @Override
    public Customer findById(int id) {
        return listCus.get(id);
    }

    @Override
    public void deleteById(int id) {
        listCus.remove(id);
    }

    @Override
    public void save(Customer customer) {
        listCus.put(customer.getId(), customer);
    }
}
