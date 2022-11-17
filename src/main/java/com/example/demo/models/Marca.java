package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Marca")
public class Marca extends Base{
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "origen")
    private String origen;

    // relationship
    @OneToOne(mappedBy = "marca", fetch = FetchType.LAZY)
    private Modelo modelo;
}
