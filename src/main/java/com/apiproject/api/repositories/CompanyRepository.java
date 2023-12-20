/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiproject.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apiproject.api.entities.Company;

/**
 *
 * @author fvasques
 */
public interface CompanyRepository extends JpaRepository<Company, Long>{
    
}
