package com.siembraconnect.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @GetMapping("/disponibles")
    public List<String> obtenerProductos() {
        return List.of("Papa", "Maíz", "Café");
    }
}
