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
        return new User(username, password, is_enabled, register_date, name, surname, email);
    }

    

}
