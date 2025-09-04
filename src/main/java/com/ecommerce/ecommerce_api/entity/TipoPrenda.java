package com.ecommerce.ecommerce_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoPrenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipoPrenda;
    private String nombrePrenda;

    public Long getId_tipoPrenda() {
        return id_tipoPrenda;
    }

    public void setId_tipoPrenda(Long id_tipoPrenda) {
        this.id_tipoPrenda = id_tipoPrenda;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }
}
