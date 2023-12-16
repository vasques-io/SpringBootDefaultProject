/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.services;

import com.apiproject.api.entities.User;
import com.apiproject.api.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fvasques
 */

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;
    
    public User create(User user){
        return repository.save(user);
    }
    
    public List<User> getAllUsers(){
        return repository.findAll();
    }
    
}
