/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.controllers;

import com.apiproject.api.DTOS.UserProjectDto;
import com.apiproject.api.entities.UserProject;
import com.apiproject.api.mapstruct.UserProjectMapper;
import com.apiproject.api.repositories.UserProjectRepository;
import jakarta.validation.Valid;
import java.util.List;
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
@RequestMapping("/users-projects")
public class UserProjectController {
    
    @Autowired
    private UserProjectRepository userProjectRepository;
    
    @PostMapping("/create")
    public ResponseEntity<UserProjectDto> createUserProject(@RequestBody @Valid UserProjectDto userPojectDto){
        var userProjectModel = new UserProject();
        userProjectModel = UserProjectMapper.MAPPER.userProjectDtoToUserProject(userPojectDto);
        userProjectModel = userProjectRepository.save(userProjectModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(UserProjectMapper.MAPPER.userProjectToUserProjectDto(userProjectModel));
    }
    
    @GetMapping("/findall")
    public ResponseEntity<List<UserProjectDto>> getAllUsersProjects(){
        return ResponseEntity.status(HttpStatus.CREATED).body(UserProjectMapper.MAPPER.userProjectToUserProjectDto(userProjectRepository.findAll()));
    }
    
}
