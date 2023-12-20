/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.services;

import com.apiproject.api.DTOS.UserDto;
import com.apiproject.api.entities.User;
import com.apiproject.api.mapstruct.UserMapper;
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
    private UserRepository userRepository;
    
    public UserDto create(UserDto userDto){
        var userModel = new User();
        
        userModel = UserMapper.MAPPER.userDtoToUser(userDto);
        
        userModel = userRepository.save(userModel);
        
        return UserMapper.MAPPER.userToUserDto(userModel);
    }
    
    public List<UserDto> getAllUsers(){
        List<User> users = this.userRepository.findAll();
        return UserMapper.MAPPER.userToUserDto(users);
    }
    
}
