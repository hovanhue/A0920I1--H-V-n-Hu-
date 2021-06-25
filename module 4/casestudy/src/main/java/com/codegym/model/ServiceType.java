package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty
    private int service_type_id;

    @NotEmpty
    @Size(max = 45)
    private String service_type_name;

    public ServiceType(@NotEmpty int service_type_id, @NotEmpty @Size(max = 45) String service_type_name) {
        this.service_type_id = service_type_id;
        this.service_type_name = service_type_name;

    }

    public ServiceType() {
    }

    public int getService_type_id() {
        return service_type_id;
    }

    public void setService_type_id(int service_type_id) {
        this.service_type_id = service_type_id;
    }

    public String getService_type_name() {
        return service_type_name;
    }

    public void setService_type_name(String service_type_name) {
        this.service_type_name = service_type_name;
    }

}
