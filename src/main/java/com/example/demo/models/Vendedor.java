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
@Table(name = "vendedor")
public class Vendedor extends Cliente{
    @Column(name = "legajo")
    private long legajo;

    //
    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL)
    private List<Venta> venta = new ArrayList<Venta>();

}
