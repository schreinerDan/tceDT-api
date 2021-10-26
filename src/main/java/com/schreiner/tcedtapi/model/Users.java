package com.schreiner.tcedtapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String name;
  
    private String surname;
    
    @Column(nullable = false)
    private String email;
    
}
