package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer position_id;

    @NotEmpty
    @Size(max = 45)
    private String position_name;

    public Position() {
    }

    public Position(@NotEmpty int position_id, @NotEmpty @Size(max = 45) String position_name, List<Employee> employees) {
        this.position_id = position_id;
        this.position_name = position_name;

    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

}
