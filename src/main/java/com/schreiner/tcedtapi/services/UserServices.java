package com.schreiner.tcedtapi.services;

import java.util.List;
import java.util.Optional;

//import com.schreiner.tcedtapi.dto.UserDTO;
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

    public User salvar(User user) {
        return userRepository.save(user);
    }
    
    public List<User> findAll() {
        
        return  userRepository.findAll();
    }
    public User get(Integer id) {
        
        return  userRepository.getById(id);
    }
    public Optional<User> findById(Integer id){
        return userRepository.findById(id);
        
    }
    public void deleteById(Integer id){
         userRepository.deleteById(id);
    }
   
}
