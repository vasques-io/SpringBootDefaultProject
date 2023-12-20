/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiproject.api.mapstruct;

import com.apiproject.api.DTOS.UserProjectDto;
import com.apiproject.api.entities.UserProject;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author fvasques
 */

@Mapper(componentModel = "spring")
public interface UserProjectMapper {
    
    UserProjectMapper MAPPER = Mappers.getMapper(UserProjectMapper.class);
    
    UserProject userProjectDtoToUserProject(UserProjectDto userProjectDto);
    
    UserProjectDto userProjectToUserProjectDto(UserProject userProject);
    
    List<UserProjectDto> userProjectToUserProjectDto(List<UserProject> userProject);
    
}
