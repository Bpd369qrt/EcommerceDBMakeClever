package com.ecommerce.ecommerce_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detallePedido;
    private Integer cantDetallePedido;
    private Double precio;

    public Long getId_detallePedido() {
        return id_detallePedido;
    }

    public void setId_detallePedido(Long id_detallePedido) {
        this.id_detallePedido = id_detallePedido;
    }

    public Integer getCantDetallePedido() {
        return cantDetallePedido;
    }

    public void setCantDetallePedido(Integer cantDetallePedido) {
        this.cantDetallePedido = cantDetallePedido;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
