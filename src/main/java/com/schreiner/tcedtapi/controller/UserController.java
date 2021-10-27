package com.schreiner.tcedtapi.controller;

import java.util.List;

import com.schreiner.tcedtapi.dto.UserDTO;
import com.schreiner.tcedtapi.dto.UserResponseDTO;
import com.schreiner.tcedtapi.model.User;
import com.schreiner.tcedtapi.repository.UserRepository;
import com.schreiner.tcedtapi.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/users")

public class UserController {
    private final UserServices userServices;
    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }
    
    @PostMapping
    public ResponseEntity<UserResponseDTO> save(@RequestBody UserDTO dto) {
        User user = userServices.save(dto.parseObject());
        return new ResponseEntity<>(UserResponseDTO.parseDTO(user), HttpStatus.CREATED);
    }
    @GetMapping
    public List<User> findAll() {
        return userServices.findAll();
        // return new UserDTO()
    }
    
    
}
