package com.schreiner.tcedtapi.dto;


import com.schreiner.tcedtapi.model.User;
import java.sql.Date;

public class UserResponseDTO {
    private int id;

    private String username;
  
    private String password;
  
    private Boolean is_enabled;

    private Date register_date;
  
    private String name;
  
    private String surname;
    
    private String email;
    
    private String phone;

    public UserResponseDTO(Integer   id2, String username2, String password2, Boolean is_enabled2, Date register_date2,
            String name2, String surname2, String email2, String phone2) {
                this.id = id2;
                this.username = username2;
                this.password = password2;
                this.is_enabled = is_enabled2;
                this.register_date = register_date2;
                this.name = name2;
                this.surname = surname2;
                this.email = email2;
                this.phone = phone2;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static UserResponseDTO parseDTO(User user) {
        
        return new UserResponseDTO(user.getId(),user.getUsername(),user.getPassword(),user.getIs_enabled(), user.getRegister_date(),user.getName(),user.getSurname(),user.getEmail(),user.getPhone() );
    }
    

    
}
