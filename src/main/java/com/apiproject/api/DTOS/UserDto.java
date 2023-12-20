/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.DTOS;

import com.apiproject.api.entities.Company;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author fvasques
 */
public class UserDto {
    
    @Getter @Setter
    private Long id;
    
    @Getter @Setter
    @NotBlank
    private String name;
    
    @Getter @Setter
    private Company company;
    
}
