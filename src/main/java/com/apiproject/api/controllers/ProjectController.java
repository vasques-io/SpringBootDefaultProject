/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.controllers;

import com.apiproject.api.DTOS.ProjectDto;
import com.apiproject.api.entities.Project;
import com.apiproject.api.mapstruct.ProjectMapper;
import com.apiproject.api.repositories.ProjectRepository;
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
@RequestMapping("/projects")
public class ProjectController {
    
    @Autowired
    private ProjectRepository projectRepository;
    
    @PostMapping("/create")
    public ResponseEntity<ProjectDto> createProject(@RequestBody @Valid ProjectDto projectDto){
        var projectModel = new Project();
        projectModel = ProjectMapper.MAPPER.projectDtoToProject(projectDto);
        projectModel = projectRepository.save(projectModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(ProjectMapper.MAPPER.projectToProjectDto(projectModel));
    }
    
    @GetMapping("/findall")
    public ResponseEntity<List<ProjectDto>> getAllProjects(){
        return ResponseEntity.status(HttpStatus.OK).body(ProjectMapper.MAPPER.projectToProjectDto(projectRepository.findAll()));
    }
    
}
