package com.codegym.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty
    private int service_id;

    @NotEmpty
    @Size(max = 45)
    private String service_name;

    @NumberFormat
    @NotEmpty
    private double service_area;

    @NumberFormat
    @NotEmpty
    private double service_cost;

    @NumberFormat
    @NotEmpty
    private int service_max_people;

    @ManyToOne
    @JoinColumn(name = "service_type_id")
    private ServiceType serviceType;

    @ManyToOne
    @JoinColumn(name = "rent_type_id")
    private RentType rentType;

    @NotEmpty
    @Size(max = 45)
    private String standard_room;

    @Size(max = 45)
    @NotEmpty
    private String description_other_convenience;

    @NumberFormat
    @NotEmpty
    private double pool_area;

    @NumberFormat
    @NotEmpty
    private int number_of_floors;

    public Service(@NotEmpty int service_id, @NotEmpty @Size(max = 45) String service_name, @NotEmpty double service_area, @NotEmpty double service_cost, @NotEmpty int service_max_people, ServiceType serviceType, RentType rentType,
                   @NotEmpty @Size(max = 45) String standard_room, @Size(max = 45) @NotEmpty String description_other_convenience, @NotEmpty double pool_area, @NotEmpty int number_of_floors) {
        this.service_id = service_id;
        this.service_name = service_name;
        this.service_area = service_area;
        this.service_cost = service_cost;
        this.service_max_people = service_max_people;
        this.serviceType = serviceType;
        this.rentType = rentType;
        this.standard_room = standard_room;
        this.description_other_convenience = description_other_convenience;
        this.pool_area = pool_area;
        this.number_of_floors = number_of_floors;

    }

    public Service() {
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public double getService_area() {
        return service_area;
    }

    public void setService_area(double service_area) {
        this.service_area = service_area;
    }

    public double getService_cost() {
        return service_cost;
    }

    public void setService_cost(double service_cost) {
        this.service_cost = service_cost;
    }

    public int getService_max_people() {
        return service_max_people;
    }

    public void setService_max_people(int service_max_people) {
        this.service_max_people = service_max_people;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }

    public String getDescription_other_convenience() {
        return description_other_convenience;
    }

    public void setDescription_other_convenience(String description_other_convenience) {
        this.description_other_convenience = description_other_convenience;
    }

    public double getPool_area() {
        return pool_area;
    }

    public void setPool_area(double pool_area) {
        this.pool_area = pool_area;
    }

    public int getNumber_of_floors() {
        return number_of_floors;
    }

    public void setNumber_of_floors(int number_of_floors) {
        this.number_of_floors = number_of_floors;
    }


}