/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiproject.api.mapstruct;

import com.apiproject.api.DTOS.UserDto;
import com.apiproject.api.entities.User;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author fvasques
 */

@Mapper(componentModel = "spring")
public interface UserMapper {
    
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
    
    @Mapping(source = "idcompany", target = "company")
    UserDto userToUserDto(User user);
    
    @Mapping(source = "idcompany", target = "company")
    List<UserDto> userToUserDto(List<User> User);
    
    @Mapping(source = "company", target = "idcompany")
    User userDtoToUser(UserDto userDto);
    
}
