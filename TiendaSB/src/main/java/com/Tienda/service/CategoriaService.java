/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author Derek
 */
public interface CategoriaService {
    //obtiene la lista de categorias de la tabla categoria
    //y lo colo en una lista de objetos categoria
    public List<Categoria> getCategorias(boolean activos);
    
    
    //Obtioene el registro de la tabla categoria
    //que tiene el idCategoria pasado por el objeto categoria
    
    public Categoria getCategoria(Categoria categoria);
    
    //Elimina el registro de la tabla categoria
    //que tiene el idCategoria pasado por el objeto categoria
    public void deleteCategoria(Categoria categoria);
    
    //Si el idCategoria pasado no exite o es nulo se crea
    //un registro nuevo en la tabla categoria
    //si el idCategoria existe... se actualiza la informacion
    public void saveCategoria(Categoria categoria);
    
}
