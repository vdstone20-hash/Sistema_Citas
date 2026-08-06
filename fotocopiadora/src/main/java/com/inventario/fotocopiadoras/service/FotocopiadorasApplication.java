package com.inventario.fotocopiadoras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.inventario.fotocopiadoras")
@EntityScan(basePackages = "com.inventario.fotocopiadoras.model")
@EnableJpaRepositories(basePackages = "com.inventario.fotocopiadoras.repository")
public class FotocopiadorasApplication {

    public static void main(String[] args) {
        SpringApplication.run(FotocopiadorasApplication.class, args);
    }
}