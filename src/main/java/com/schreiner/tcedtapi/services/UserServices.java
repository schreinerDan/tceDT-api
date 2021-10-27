package com.schreiner.tcedtapi.services;

import java.util.List;

import com.schreiner.tcedtapi.model.User;
import com.schreiner.tcedtapi.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    private final UserRepository  userRepository;

    @Autowired
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }

    
}
