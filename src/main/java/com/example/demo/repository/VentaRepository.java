package com.example.demo.repository;

import com.example.demo.models.Cliente;
import com.example.demo.models.Venta;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends BaseRepository<Venta, Long>{
    
}
