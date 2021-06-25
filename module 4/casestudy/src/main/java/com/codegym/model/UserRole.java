package com.codegym.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(UserRole.class)
public class UserRole implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role_id;

    @Id
    @ManyToOne
    @JoinColumn(name = "username")
    private User username;


    public UserRole(){

    }

    public UserRole(Role role_id, User username) {
        this.role_id = role_id;
        this.username = username;
    }

    public Role getRole_id() {
        return role_id;
    }

    public void setRole_id(Role role_id) {
        this.role_id = role_id;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }
}
