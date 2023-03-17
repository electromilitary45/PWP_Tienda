/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service.impl;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import com.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CategoriaServiceImpl implements CategoriaService{
    
    
    //Esto crea una unica copia de un objeto
    @Autowired
    private CategoriaDao categoriaDao;
    
    
    @Override
    public List<Categoria> getCategorias(boolean activos) {
        
        var lista= (List<Categoria>) categoriaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    public void deleteCategoria(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

    @Override
    public void saveCategoria(Categoria categoria) {
        categoriaDao.save(categoria);
    }
    
    
    
    
}
