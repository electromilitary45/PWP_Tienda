/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.dao;

import com.Tienda.domain.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Derek
 */

public interface ArticuloDao extends JpaRepository<Articulo,Long>{
    
}
