/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiproject.api.repositories;

import com.apiproject.api.entities.UserProject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fvasques
 */
public interface UserProjectRepository extends JpaRepository<UserProject, Long>{
    
}
