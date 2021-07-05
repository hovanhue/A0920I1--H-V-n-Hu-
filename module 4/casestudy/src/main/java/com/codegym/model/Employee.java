package com.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;

    @NotEmpty
    @Size(max = 45)
    private String employee_name;

    @NotEmpty
    @Size(max = 45)
    @DateTimeFormat
    private String employee_birthday;

    @NotEmpty
    @Size(max = 45)
    private String employee_id_card;

    @NotEmpty
    @NumberFormat
    private String employee_salary;

    @NotEmpty
    @Size(max = 45)
    private String employee_phone;

    @NotEmpty
    @Size(max = 45)
    @Email(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")
    private String employee_email;

    @NotEmpty
    @Size(max = 45)
    private String employee_address;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_degree_id")
    private EducationDegree education_degree;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Employee(){
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(String employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public String getEmployee_id_card() {
        return employee_id_card;
    }

    public void setEmployee_id_card(String employee_id_card) {
        this.employee_id_card = employee_id_card;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(String employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducation_degree() {
        return education_degree;
    }

    public void setEducation_degree(EducationDegree education_degree) {
        this.education_degree = education_degree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
