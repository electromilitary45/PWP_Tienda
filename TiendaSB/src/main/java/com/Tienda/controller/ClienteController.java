package com.Tienda.controller;

/*-----LIBRERIAS------*/
import com.Tienda.domain.Cliente;
import com.Tienda.service.ClienteService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*-CONTROLADOR-*/
@Controller


public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    
    
    //---Mapeo de Ruta
    @GetMapping("/")
    
    //---
    public String inicio(Model model){
        
        
        var clientes=clienteService.getClientes();
        
        model.addAttribute("cliente",clientes );
        
        return "index";
    }
    
    @GetMapping("/cliente/eliminar/{idCliente}")
    public String eliminaCliente(Cliente cliente){
        clienteService.deleteCliente(cliente);
        return "redirect:/";
    }
    
    @GetMapping("/cliente/nuevo/")
    public String nuevoCliente(Cliente cliente){
        
        return "modificaCliente";
    }
    
    @PostMapping("/cliente/guardar")
    public String guardarCliente(Cliente cliente){
        clienteService.saveCliente(cliente);
        return "redirect:/";
    }
    
    @GetMapping("/cliente/modificar/{idCliente}")
    public String modificaCliente(Cliente cliente, Model model){
        cliente=clienteService.getCliente(cliente);
        model.addAttribute("cliente",cliente);
        return "modificaCliente";
    }
    
    
}
