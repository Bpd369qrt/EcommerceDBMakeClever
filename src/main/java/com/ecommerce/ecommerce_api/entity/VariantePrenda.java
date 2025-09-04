package com.ecommerce.ecommerce_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VariantePrenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_variantePrenda;
    private String nomVarientePrenda;

    public Long getId_variantePrenda() {
        return id_variantePrenda;
    }

    public void setId_variantePrenda(Long id_variantePrenda) {
        this.id_variantePrenda = id_variantePrenda;
    }

    public String getNomVarientePrenda() {
        return nomVarientePrenda;
    }

    public void setNomVarientePrenda(String nomVarientePrenda) {
        this.nomVarientePrenda = nomVarientePrenda;
    }
}
