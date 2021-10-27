package com.schreiner.tcedtapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @ApiModelProperty(value = "Código da pessoa")
    private Long id;
  
    @Column(nullable = false)
    private String username;
  
    @Column(nullable = false)
    private String password;
  
    @Column(nullable = false)
    private Boolean is_enabled;

    @Column(nullable = false)
    private Date register_date;
  
    @Column(nullable = false)
    @ApiModelProperty(value = "Nome da pessoa")
    private String name;
  
    private String surname;
    
    @Column(nullable = false)
    private String email;

   
    public User(String username,String password, Boolean is_enabled, Date register_date,
            String name,String surname,String email){
            this.username = username;
            this.password = password;
            this.is_enabled = is_enabled;
            this.register_date = register_date;
            this.name = name;
            this.surname = surname;
            this.email = email;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
