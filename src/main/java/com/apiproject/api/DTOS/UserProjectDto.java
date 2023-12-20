/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.DTOS;

import com.apiproject.api.entities.Project;
import com.apiproject.api.entities.User;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author fvasques
 */
public class UserProjectDto {
    
    @Getter @Setter
    private Long id;
    
    @Getter @Setter
    private User user;
    
    @Getter @Setter
    private Project project;
    
}
