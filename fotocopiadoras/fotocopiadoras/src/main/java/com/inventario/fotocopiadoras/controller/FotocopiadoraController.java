package com.inventario.fotocopiadoras.controller;

import com.inventario.fotocopiadoras.model.Fotocopiadora;
import com.inventario.fotocopiadoras.service.FotocopiadoraService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fotocopiadoras")
@RequiredArgsConstructor
public class FotocopiadoraController {

    private final FotocopiadoraService fotocopiadoraService;

    @GetMapping
    public ResponseEntity<List<Fotocopiadora>> listarTodas() {
        return ResponseEntity.ok(fotocopiadoraService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fotocopiadora> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(fotocopiadoraService.obtenerPorId(id));
    }

    @PostMapping
    public ResponseEntity<Fotocopiadora> crear(@Valid @RequestBody Fotocopiadora fotocopiadora) {
        Fotocopiadora creada = fotocopiadoraService.crear(fotocopiadora);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fotocopiadora> actualizar(@PathVariable Long id,
                                                      @Valid @RequestBody Fotocopiadora fotocopiadora) {
        return ResponseEntity.ok(fotocopiadoraService.actualizar(id, fotocopiadora));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        fotocopiadoraService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

}
