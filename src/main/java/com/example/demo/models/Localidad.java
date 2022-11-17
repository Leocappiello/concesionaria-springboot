package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "localidad")
public class Localidad extends Base{
    @Column(name = "nombre")
    private String nombre;

    //
    @OneToMany(mappedBy = "localidad", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Domicilio> domicilio = new ArrayList<Domicilio>();
}
