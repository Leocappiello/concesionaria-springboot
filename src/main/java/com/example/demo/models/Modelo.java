package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Modelo")
public class Modelo extends Base{
    @Column(name="motor")
    private float motor;

    @Column(name="version")
    private String version;

    @Column(name = "urlImage")
    private String urlImage;

    //
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_marca")
    private Marca marca;
}
