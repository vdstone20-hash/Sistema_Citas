package com.inventario.fotocopiadoras.repository;

import com.inventario.fotocopiadoras.model.Fotocopiadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotocopiadoraRepository extends JpaRepository<Fotocopiadora, Long> {
}
