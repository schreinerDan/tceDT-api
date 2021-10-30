package com.schreiner.tcedtapi.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.schreiner.tcedtapi.dto.UserDTO;
import com.schreiner.tcedtapi.dto.UserResponseDTO;
import com.schreiner.tcedtapi.model.User;
import com.schreiner.tcedtapi.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")

public class UserController {
    private final UserServices userServices;
    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }
    
    @PostMapping
    public ResponseEntity<UserResponseDTO> salvar(@RequestBody UserDTO dto) {
        User user = userServices.salvar(dto.parseObject());
        return new ResponseEntity<>(UserResponseDTO.parseDTO(user), HttpStatus.CREATED);
    }
    @GetMapping
    public List<UserDTO> findAll() {
        
        return userServices.findAll().stream().map(User-> new UserDTO(User)).collect(Collectors.toList());
        
        
    }
    @GetMapping("/{id}")
    public UserDTO get(@PathVariable Integer id)
    {
        UserDTO userDTO = new UserDTO(userServices.get(id));
        return userDTO;
        
    }
    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity <?> delete(@PathVariable Integer id) {
        return userServices.findById(id)
                .map(record -> {
                    userServices.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value="/{id}")
    public ResponseEntity update(@PathVariable("id") Integer id,
                                      @RequestBody UserDTO dto) {
        return userServices.findById(id)
                .map(record -> {
                    record.setName(dto.getName());
                    record.setEmail(dto.getEmail());
                    record.setUsername(dto.getUsername());
                    
                    User updated = userServices.salvar(record);
                    return ResponseEntity.ok().body(new UserDTO(updated));
                }).orElse(ResponseEntity.notFound().build());
    }

    
    
}
