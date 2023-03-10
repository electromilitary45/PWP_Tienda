package com.Tienda.controller;

/*-----LIBRERIAS------*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/*-CONTROLADOR-*/
@Controller

public class IndexController {

    //---Mapeo de Ruta
    @GetMapping("/")
    public String inicio(Model model){
        return "index";
    }
    

    
    
}//fin class
