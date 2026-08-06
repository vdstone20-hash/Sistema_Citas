package com.inventario.fotocopiadoras.service;

import com.inventario.fotocopiadoras.model.Fotocopiadora;
import com.inventario.fotocopiadoras.repository.FotocopiadoraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FotocopiadoraServiceImpl implements FotocopiadoraService {

    private final FotocopiadoraRepository fotocopiadoraRepository;

    @Override
    public List<Fotocopiadora> listarTodas() {
        return fotocopiadoraRepository.findAll();
    }

    @Override
    public Fotocopiadora obtenerPorId(Long id) {
        return fotocopiadoraRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Fotocopiadora no encontrada con id: " + id));
    }

    @Override
    public Fotocopiadora crear(Fotocopiadora fotocopiadora) {
        return fotocopiadoraRepository.save(fotocopiadora);
    }

    @Override
    public Fotocopiadora actualizar(Long id, Fotocopiadora fotocopiadora) {
        Fotocopiadora existente = obtenerPorId(id);
        existente.setMarca(fotocopiadora.getMarca());
        existente.setModelo(fotocopiadora.getModelo());
        existente.setSerie(fotocopiadora.getSerie());
        existente.setEstado(fotocopiadora.getEstado());
        return fotocopiadoraRepository.save(existente);
    }

    @Override
    public void eliminar(Long id) {
        Fotocopiadora existente = obtenerPorId(id);
        fotocopiadoraRepository.delete(existente);
    }

}
