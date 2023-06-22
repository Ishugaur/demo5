package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credentials")
public class Credential {
    @Id
    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "password", length = 60)
    private String password;

    public String getUsername(String ishu) {
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