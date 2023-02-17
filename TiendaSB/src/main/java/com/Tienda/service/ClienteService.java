/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.domain.Cliente;
import java.util.List;

/**
 *
 * @author Derek
 */
public interface ClienteService {
    //obtiene la lista de clientes de la tabla cliente
    //y lo colo en una lista de objetos cliente
    public List<Cliente> getClientes();
    
    
    //Obtioene el registro de la tabla cliente
    //que tiene el idCliente pasado por el objeto cliente
    
    public Cliente getCliente(Cliente cliente);
    
    //Elimina el registro de la tabla cliente
    //que tiene el idCliente pasado por el objeto cliente
    public void deleteCliente(Cliente cliente);
    
    //Si el idCliente pasado no exite o es nulo se crea
    //un registro nuevo en la tabla cliente
    //si el idCliente existe... se actualiza la informacion
    public void saveCliente(Cliente cliente);
    
}
