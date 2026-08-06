package com.inventario.fotocopiadoras.service;

import com.inventario.fotocopiadoras.model.Fotocopiadora;
import java.util.List;

public interface FotocopiadoraService {
    List<Fotocopiadora> listarTodas();
    Fotocopiadora guardar(Fotocopiadora fotocopiadora);
}