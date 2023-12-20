package com.apiproject.api.mapstruct;

import com.apiproject.api.DTOS.ProjectDto;
import com.apiproject.api.entities.Project;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author fvasques
 */
@Mapper(componentModel = "spring")
public interface ProjectMapper {
    
    ProjectMapper MAPPER = Mappers.getMapper(ProjectMapper.class);
    
    Project projectDtoToProject(ProjectDto project);
    
    ProjectDto projectToProjectDto(Project project);
    
    List<ProjectDto> projectToProjectDto(List<Project> project);
    
}
