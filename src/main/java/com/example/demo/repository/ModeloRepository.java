package com.example.demo.repository;

import com.example.demo.models.Cliente;
import com.example.demo.models.Modelo;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepository extends BaseRepository<Modelo, Long>{
    
}
