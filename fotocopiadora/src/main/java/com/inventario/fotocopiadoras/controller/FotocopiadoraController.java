package com.inventario.fotocopiadoras.controller;

import com.inventario.fotocopiadoras.model.Fotocopiadora;
import com.inventario.fotocopiadoras.service.FotocopiadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/fotocopiadoras")
public class FotocopiadoraController {

    @Autowired
    private FotocopiadoraService service;

    // Ruta para listar todas las fotocopiadoras: GET http://localhost:8080/api/fotocopiadoras
    @GetMapping
    public List<Fotocopiadora> listar() {
        return service.listarTodas();
    }

    // Ruta para registrar una nueva fotocopiadora: POST http://localhost:8080/api/fotocopiadoras
    @PostMapping
    public Fotocopiadora guardar(@RequestBody Fotocopiadora fotocopiadora) {
        return service.guardar(fotocopiadora);
    }
}