package com.schreiner.tcedtapi.dto;

import java.sql.Date;

import com.schreiner.tcedtapi.model.User;





public class UserDTO {
   
    private String username;
  
    private String password;
  
    private Boolean is_enabled;

    private Date register_date;
  
    private String name;
  
    private String surname;
    
    private String email;

    public User parseObject(){
        // return new User(username, password, is_enabled, register_date, name, surname, email);
        return new User(username, password, is_enabled, register_date, name, surname, email);
    }

    public UserDTO(){

    }
    public UserDTO(String username,String password, Boolean is_enabled, Date register_date,
        String name,String surname,String email){
        this.username = username;
        this.password = password;
        this.is_enabled = is_enabled;
        this.register_date = register_date;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    public UserDTO(User user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.is_enabled = user.getIs_enabled();
        this.register_date = user.getRegister_date();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
    }
    /*
    public  UserDTO convertDTO(User user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.is_enabled = user.getIs_enabled();
        this.register_date = user.getRegister_date();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        
        return this;

    }*/


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
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
