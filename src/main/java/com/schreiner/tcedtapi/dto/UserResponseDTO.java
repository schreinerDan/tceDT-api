package com.schreiner.tcedtapi.dto;


import com.schreiner.tcedtapi.model.User;
import java.sql.Date;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserResponseDTO {
    private Long id;

    private String username;
  
    private String password;
  
    private Boolean is_enabled;

    private Date register_date;
  
    private String name;
  
    private String surname;
    
    private String email;
    public UserResponseDTO(Long id2, String username2, String password2, Boolean is_enabled2, Date register_date2,
            String name2, String surname2, String email2) {
    }
    public static UserResponseDTO parseDTO(User user) {
        
        return new UserResponseDTO(user.getId(),user.getUsername(),user.getPassword(),user.getIs_enabled(), user.getRegister_date(),user.getName(),user.getSurname(),user.getEmail() );
    }

    
}
