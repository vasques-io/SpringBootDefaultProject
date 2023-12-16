/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.controllers;

import com.apiproject.api.DTOS.UserRecordDto;
import com.apiproject.api.entities.User;
import com.apiproject.api.services.UserService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fvasques
 */

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService service;
    
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody @Valid UserRecordDto userRecordDto){
        var userModel = new User();
        BeanUtils.copyProperties(userRecordDto, userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(userModel));
    }
    
    @GetMapping("/findall")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllUsers());
    }
    
}
