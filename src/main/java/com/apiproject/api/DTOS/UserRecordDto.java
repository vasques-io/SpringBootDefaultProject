/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.apiproject.api.DTOS;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author fvasques
 */
public record UserRecordDto(@NotBlank String name) {
    
}
