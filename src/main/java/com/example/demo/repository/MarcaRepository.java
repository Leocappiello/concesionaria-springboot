package com.example.demo.repository;

import com.example.demo.models.Cliente;
import com.example.demo.models.Marca;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends BaseRepository<Marca, Long>{
    
}
