package com.Tienda.controller;

/*-----LIBRERIAS------*/
import com.Tienda.domain.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*-CONTROLADOR-*/
@Controller


public class ClienteController {
    //---Mapeo de Ruta
    @GetMapping("/")
    
    //---
    public String inicio(Model model){
        var saludo="CHIMBA EL BACKEND";
        model.addAttribute("mensaje", saludo);
        
        /*--CREACION CON OBJETO--*/
        /*Cliente c = new Cliente("Derek", "Leiva Villalobos", "dleiva00042@ufide.ac.cr", "61692145");
        Cliente c2 = new Cliente("Sebastian", "Leiva Villalobos", "dleiva00042@ufide.ac.cr", "61692145");
        Cliente c3 = new Cliente("Electro", "Leiva Villalobos", "dleiva00042@ufide.ac.cr", "61692145");
        Cliente c4 = new Cliente("Sebolla", "Leiva Villalobos", "dleiva00042@ufide.ac.cr", "61692145");*/
        
        //var clientes=Arrays.asList(c,c2,c3,c4);
        
        //odel.addAttribute("cliente",clientes );
        
        return "index";
    }
    
}
