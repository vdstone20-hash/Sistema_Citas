package com.inventario.fotocopiadoras.service;

import com.inventario.fotocopiadoras.model.Fotocopiadora;

import java.util.List;

public interface FotocopiadoraService {

    List<Fotocopiadora> listarTodas();

    Fotocopiadora obtenerPorId(Long id);

    Fotocopiadora crear(Fotocopiadora fotocopiadora);

    Fotocopiadora actualizar(Long id, Fotocopiadora fotocopiadora);

    void eliminar(Long id);

}
