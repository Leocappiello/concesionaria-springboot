package com.example.demo.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "auto")
public class Auto extends Base{
    @Column(name = "costo")
    private float costo;

    @Column(name = "precio")
    private float precio;

    @Column(name = "observacion")
    private String observacion;

    //
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_paisOrigen")
    private Pais paisOrigen;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_color")
    private Color color;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_modelo")
    private Modelo modelo;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "venta_auto",
            joinColumns = @JoinColumn(name = "auto_id"),
            inverseJoinColumns = @JoinColumn(name = "venta_id")
    )
    private Venta venta;

}

