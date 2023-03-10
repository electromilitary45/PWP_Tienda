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
import org.springframework.web.bind.annotation.RequestMapping;

/*-CONTROLADOR-*/
@Controller
@RequestMapping("/cliente")

public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    
    //---------Mapeo de Ruta-------
    
    //---
    @GetMapping("/listado")
    public String inicio(Model model){
        var cliente= clienteService.getClientes();
        model.addAttribute("cliente",cliente);
        return "/cliente/listado";
    }
    //---
    @GetMapping("/eliminar/{idCliente}")
    public String eliminaCliente(Cliente cliente){
        clienteService.deleteCliente(cliente);
        return "redirect:/cliente/listado";
    }
    
    //----
    @GetMapping("/nuevo/")
    public String nuevoCliente(Cliente cliente){
        return "/cliente/modifica";
    }
    
    //----
    @PostMapping("/guardar")
    public String guardarCliente(Cliente cliente){
        clienteService.saveCliente(cliente);
        return "redirect:/cliente/listado";
    }
    
    //---
    @GetMapping("/modificar/{idCliente}")
    public String modificaCliente(Cliente cliente, Model model){
        cliente=clienteService.getCliente(cliente);
        model.addAttribute("cliente",cliente);
        return "/cliente/modifica";
    }
    
    
}
