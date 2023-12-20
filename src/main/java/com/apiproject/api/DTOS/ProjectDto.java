/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.DTOS;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author fvasques
 */
public class ProjectDto {
    
    @Getter @Setter
    private Long id;
    
    @Getter @Setter
    private String project_name;
    
}
