package com.codegym.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NumberFormat
    private int attach_service_id;

    @NotEmpty
    @Size(max = 45)
    private String attach_service_name;

    @NotEmpty
    @NumberFormat
    private double attach_service_cost;

    @NotEmpty
    @NumberFormat
    private int attach_service_unit;

    @NotEmpty
    @Size(max = 45)
    private String attach_service_status;

    public AttachService() {
    }

    public AttachService(int attach_service_id, @NotEmpty @Size(max = 45) String attach_service_name, @NotEmpty double attach_service_cost, @NotEmpty int attach_service_unit, @NotEmpty @Size(max = 45) String attach_service_status) {
        this.attach_service_id = attach_service_id;
        this.attach_service_name = attach_service_name;
        this.attach_service_cost = attach_service_cost;
        this.attach_service_unit = attach_service_unit;
        this.attach_service_status = attach_service_status;
    }

    public int getAttach_service_id() {
        return attach_service_id;
    }

    public void setAttach_service_id(int attach_service_id) {
        this.attach_service_id = attach_service_id;
    }

    public String getAttach_service_name() {
        return attach_service_name;
    }

    public void setAttach_service_name(String attach_service_name) {
        this.attach_service_name = attach_service_name;
    }

    public double getAttach_service_cost() {
        return attach_service_cost;
    }

    public void setAttach_service_cost(double attach_service_cost) {
        this.attach_service_cost = attach_service_cost;
    }

    public int getAttach_service_unit() {
        return attach_service_unit;
    }

    public void setAttach_service_unit(int attach_service_unit) {
        this.attach_service_unit = attach_service_unit;
    }

    public String getAttach_service_status() {
        return attach_service_status;
    }

    public void setAttach_service_status(String attach_service_status) {
        this.attach_service_status = attach_service_status;
    }

}
