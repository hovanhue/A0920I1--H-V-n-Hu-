package com.codegym.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class RentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty
    @NumberFormat
    private int rent_type_id;

    @NotEmpty
    @Size(max = 45)
    private String rent_type_name;

    @NotEmpty
    @NumberFormat
    private double rent_type_cost;

    public RentType() {
    }

    public RentType(@NotEmpty int rent_type_id, @NotEmpty @Size(max = 45) String rent_type_name, @NotEmpty double rent_type_cost) {
        this.rent_type_id = rent_type_id;
        this.rent_type_name = rent_type_name;
        this.rent_type_cost = rent_type_cost;

    }

    public int getRent_type_id() {
        return rent_type_id;
    }

    public void setRent_type_id(int rent_type_id) {
        this.rent_type_id = rent_type_id;
    }

    public String getRent_type_name() {
        return rent_type_name;
    }

    public void setRent_type_name(String rent_type_name) {
        this.rent_type_name = rent_type_name;
    }

    public double getRent_type_cost() {
        return rent_type_cost;
    }

    public void setRent_type_cost(double rent_type_cost) {
        this.rent_type_cost = rent_type_cost;
    }

}
