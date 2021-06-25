package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class User {
    @Id
    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    public User(@NotEmpty String username, @NotEmpty String password) {
        this.username = username;
        this.password = password;

    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
