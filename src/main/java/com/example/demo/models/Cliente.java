package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente extends Base{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "dni")
    private int dni;

    @Column(name = "razonSocial")
    private String razonSocial;

    @Column(name = "cuit")
    private long cuit;

    @Column(name = "estado")
    private boolean estado;

    //
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pais_id")
    private Pais pais;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;
}
