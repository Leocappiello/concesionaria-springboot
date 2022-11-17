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
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "venta")
public class Venta extends Base{
    @Column(name = "fecha")
    private long fecha;

    @Column(name = "total")
    private float total;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "impuesto")
    private float impuesto;

    //
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "vendedor_venta",
            joinColumns = @JoinColumn(name = "venta_id"),
            inverseJoinColumns = @JoinColumn(name = "vendedor_id")
    )
    private Vendedor vendedor;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<Auto> auto = new ArrayList<Auto>() ;
}
