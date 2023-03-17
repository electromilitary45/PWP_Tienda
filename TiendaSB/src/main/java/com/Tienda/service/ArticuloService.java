/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.domain.Articulo;
import java.util.List;

/**
 *
 * @author Derek
 */
public interface ArticuloService {
    //obtiene la lista de articulos de la tabla articulo
    //y lo colo en una lista de objetos articulo
    public List<Articulo> getArticulos(boolean activos);
    
    
    //Obtioene el registro de la tabla articulo
    //que tiene el idArticulo pasado por el objeto articulo
    
    public Articulo getArticulo(Articulo articulo);
    
    //Elimina el registro de la tabla articulo
    //que tiene el idArticulo pasado por el objeto articulo
    public void deleteArticulo(Articulo articulo);
    
    //Si el idArticulo pasado no exite o es nulo se crea
    //un registro nuevo en la tabla articulo
    //si el idArticulo existe... se actualiza la informacion
    public void saveArticulo(Articulo articulo);
    
}
