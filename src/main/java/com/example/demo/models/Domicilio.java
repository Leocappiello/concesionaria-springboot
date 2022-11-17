package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "domicilio")
public class Domicilio extends Base{
    @Column(name = "direccion")
    private String direccion;

    //
    @ManyToOne(
            cascade = CascadeType.PERSIST,
            optional = false
    )
    @JoinTable(
            name = "localidad_domicilio",
            joinColumns = @JoinColumn(name = "domicilio_id"),
            inverseJoinColumns = @JoinColumn(name = "localidad_id")
    )
    private Localidad localidad;
}
