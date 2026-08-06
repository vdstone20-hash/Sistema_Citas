package com.inventario.fotocopiadoras.service;

import com.inventario.fotocopiadoras.model.Fotocopiadora;
import com.inventario.fotocopiadoras.repository.FotocopiadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FotocopiadoraServiceImpl implements FotocopiadoraService {

    @Autowired
    private FotocopiadoraRepository repository;

    @Override
    public List<Fotocopiadora> listarTodas() {
        return repository.findAll();
    }

    @Override
    public Fotocopiadora guardar(Fotocopiadora fotocopiadora) {
        return repository.save(fotocopiadora);
    }
}