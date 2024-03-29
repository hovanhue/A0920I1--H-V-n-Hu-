package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;
    private String contenDetails;

    public Blog(Integer id, String content, String contenDetails) {
        this.id = id;
        this.content = content;
        this.contenDetails = contenDetails;
    }

    public Blog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContenDetails() {
        return contenDetails;
    }

    public void setContenDetails(String contenDetails) {
        this.contenDetails = contenDetails;
    }
}
