package com.ecommerce.ecommerce_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarritoDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_carritoDetalle;
    private Integer cantCarritoDetalle;

    public Long getId_carritoDetalle() {
        return id_carritoDetalle;
    }

    public void setId_carritoDetalle(Long id_carritoDetalle) {
        this.id_carritoDetalle = id_carritoDetalle;
    }

    public Integer getCantCarritoDetalle() {
        return cantCarritoDetalle;
    }

    public void setCantCarritoDetalle(Integer cantCarritoDetalle) {
        this.cantCarritoDetalle = cantCarritoDetalle;
    }
}
