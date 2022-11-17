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
@Table(name = "pais")
public class Pais extends Base{
    @Column(name = "nombre")
    private String nombre;

    //
    @OneToOne(mappedBy = "paisOrigen")
    private Auto auto;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "region_pais",
            joinColumns = @JoinColumn(name = "pais_id"),
            inverseJoinColumns = @JoinColumn(name = "region_id")
    )
    private Region region;
}
