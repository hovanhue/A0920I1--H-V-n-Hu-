package dao;

import model.Customer;

import java.util.List;

public interface CustomerImpl {
    void insertCustomer(Customer customer);
    List<Customer> getAllCustomer();
    Customer getCustomerById(int id);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);

}
