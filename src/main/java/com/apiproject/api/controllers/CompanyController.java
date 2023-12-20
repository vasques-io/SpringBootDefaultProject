/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.controllers;

import com.apiproject.api.DTOS.CompanyRecordDto;
import com.apiproject.api.entities.Company;
import com.apiproject.api.repositories.CompanyRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fvasques
 */

@RestController
@RequestMapping("/company")
public class CompanyController {
    
    @Autowired
    private CompanyRepository repository;
    
    @PostMapping("/create")
    public ResponseEntity<Company> createComapany(@RequestBody @Valid CompanyRecordDto companyDto){
        var companyModel = new Company();
        BeanUtils.copyProperties(companyDto, companyModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(companyModel));
    }
    
}
