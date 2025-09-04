package com.ecommerce.ecommerce_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_carrito;
    private Date fechaCreacionCarrito;

    public Long getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(Long id_carrito) {
        this.id_carrito = id_carrito;
    }

    public Date getFechaCreacionCarrito() {
        return fechaCreacionCarrito;
    }

    public void setFechaCreacionCarrito(Date fechaCreacionCarrito) {
        this.fechaCreacionCarrito = fechaCreacionCarrito;
    }
}
