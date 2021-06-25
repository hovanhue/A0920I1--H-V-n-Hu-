package com.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NumberFormat
    private int contract_id;

    @NotEmpty
    @Size(max = 45)
    @DateTimeFormat
    private String contract_start_date;

    @NotEmpty
    @Size(max = 45)
    @DateTimeFormat
    private String contract_end_date;

    @NotEmpty
    @NumberFormat
    private double contract_deposit;

    @NotEmpty
    @NumberFormat
    private double contract_total_money;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer_id;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service_id;

    public Contract() {
    }

    public Contract(int contract_id, @NotEmpty @Size(max = 45) String contract_start_date, @NotEmpty @Size(max = 45) String contract_end_date, @NotEmpty double contract_deposit,
                    @NotEmpty double contract_total_money, Employee employee, Customer customer_id, Service service_id) {
        this.contract_id = contract_id;
        this.contract_start_date = contract_start_date;
        this.contract_end_date = contract_end_date;
        this.contract_deposit = contract_deposit;
        this.contract_total_money = contract_total_money;
        this.employee = employee;
        this.customer_id = customer_id;
        this.service_id = service_id;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public String getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(String contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public String getContract_end_date() {
        return contract_end_date;
    }

    public void setContract_end_date(String contract_end_date) {
        this.contract_end_date = contract_end_date;
    }

    public double getContract_deposit() {
        return contract_deposit;
    }

    public void setContract_deposit(double contract_deposit) {
        this.contract_deposit = contract_deposit;
    }

    public double getContract_total_money() {
        return contract_total_money;
    }

    public void setContract_total_money(double contract_total_money) {
        this.contract_total_money = contract_total_money;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Customer customer_id) {
        this.customer_id = customer_id;
    }

    public Service getService_id() {
        return service_id;
    }

    public void setService_id(Service service_id) {
        this.service_id = service_id;
    }

}
