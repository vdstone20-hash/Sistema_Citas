package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private LocalDate fechaNacimiento;
    private String genero;
    private String preferenciaGenero;
    
    @Column(length = 500)
    private String descripcion;
    
    private Double ubicacionActualLat;
    private Double ubicacionActualLon;
    private Boolean esPremium;

    // Constructor vacío obligatorio para JPA
    public Usuario() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getPreferenciaGenero() { return preferenciaGenero; }
    public void setPreferenciaGenero(String preferenciaGenero) { this.preferenciaGenero = preferenciaGenero; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Double getUbicacionActualLat() { return ubicacionActualLat; }
    public void setUbicacionActualLat(Double ubicacionActualLat) { this.ubicacionActualLat = ubicacionActualLat; }

    public Double getUbicacionActualLon() { return ubicacionActualLon; }
    public void setUbicacionActualLon(Double ubicacionActualLon) { this.ubicacionActualLon = ubicacionActualLon; }

    public Boolean getEsPremium() { return esPremium; }
    public void setEsPremium(Boolean esPremium) { this.esPremium = esPremium; }
}