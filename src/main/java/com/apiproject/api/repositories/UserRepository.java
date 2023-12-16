/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiproject.api.repositories;

import com.apiproject.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author fvasques
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
}
