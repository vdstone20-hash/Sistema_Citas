package com.inventario.fotocopiadoras.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fotocopiadoras")
public class Fotocopiadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private String serie;

    // === CONSTRUCTORES ===
    public Fotocopiadora() {
    }

    public Fotocopiadora(Long id, String marca, String modelo, String serie) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
    }

    // === GETTERS Y SETTERS MANUALES ===
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}