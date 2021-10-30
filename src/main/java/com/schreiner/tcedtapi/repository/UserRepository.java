package com.schreiner.tcedtapi.repository;

import com.schreiner.tcedtapi.model.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer>{
    
}
