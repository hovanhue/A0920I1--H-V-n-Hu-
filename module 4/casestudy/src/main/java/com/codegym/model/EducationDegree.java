package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty
    private int education_degree_id;

    @NotEmpty
    @Size(max = 45)
    private String education_degree_name;


    public EducationDegree(@NotEmpty int education_degree_id, @NotEmpty @Size(max = 45) String education_degree_name) {
        this.education_degree_id = education_degree_id;
        this.education_degree_name = education_degree_name;

    }

    public int getEducation_degree_id() {
        return education_degree_id;
    }

    public void setEducation_degree_id(int education_degree_id) {
        this.education_degree_id = education_degree_id;
    }

    public String getEducation_degree_name() {
        return education_degree_name;
    }

    public void setEducation_degree_name(String education_degree_name) {
        this.education_degree_name = education_degree_name;
    }

    public EducationDegree() {
    }
}
