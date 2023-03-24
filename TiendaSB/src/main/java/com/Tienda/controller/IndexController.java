package com.Tienda.controller;

/*-----LIBRERIAS------*/
import com.Tienda.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/*-CONTROLADOR-*/
@Controller

public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
    
    //---Mapeo de Ruta
    @GetMapping("/")
    public String inicio(Model model){
        var articulo = articuloService.getArticulos(false);
        model.addAttribute("articulos",articulo);
        return "index";
    }
    

    
    
}//fin class
