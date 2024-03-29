package com.Tienda.controller;

/*-----LIBRERIAS------*/
import com.Tienda.domain.Articulo;
import com.Tienda.service.ArticuloService;
import com.Tienda.service.CategoriaService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*-CONTROLADOR-*/
@Controller
@RequestMapping("/articulo")

public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @Autowired
    private CategoriaService categoriaService;
    //---------Mapeo de Ruta-------

    //---
    @GetMapping("/listado")
    public String inicio(Model model) {
        var articulo = articuloService.getArticulos(false);
        var categoria = categoriaService.getCategorias(false);
        model.addAttribute("articulo", articulo);
        model.addAttribute("totalArticulos", articulo.size());
        model.addAttribute("categoria", categoria);
        return "/articulo/listado";
    }

    //---
    @GetMapping("/eliminar/{idArticulo}")
    public String eliminaArticulo(Articulo articulo) {
        articuloService.deleteArticulo(articulo);
        return "redirect:/articulo/listado";
    }

    //----
    @GetMapping("/nuevo/")
    public String nuevoArticulo(Articulo articulo) {
        return "/articulo/modifica";
    }

    //----
    @PostMapping("/guardar")
    public String guardarArticulo(Articulo articulo) {
        articuloService.saveArticulo(articulo);
        return "redirect:/articulo/listado";
    }

    //---
    @GetMapping("/modificar/{idArticulo}")
    public String modificaArticulo(Articulo articulo, Model model) {
        articulo = articuloService.getArticulo(articulo);
        var categoria = categoriaService.getCategorias(false);
        model.addAttribute("articulo", articulo);
        model.addAttribute("categoria", categoria);

        return "/articulo/modifica";
    }

}
