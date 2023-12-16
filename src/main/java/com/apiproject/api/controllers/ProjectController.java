/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.controllers;

import com.apiproject.api.DTOS.ProjectRecordDto;
import com.apiproject.api.entities.Project;
import com.apiproject.api.repositories.ProjectRepository;
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
@RequestMapping("/projects")
public class ProjectController {
    
    @Autowired
    private ProjectRepository repository;
    
    @PostMapping("/create")
    public ResponseEntity<Project> createProject(@RequestBody @Valid ProjectRecordDto projectDto){
        var projectModel = new Project();
        BeanUtils.copyProperties(projectDto, projectModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(projectModel));
    }
    
    @GetMapping("/findall")
    public ResponseEntity<List<Project>> getAllProjects(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
    
}
