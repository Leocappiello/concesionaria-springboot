package com.example.demo.repository;

import com.example.demo.models.Cliente;
import com.example.demo.models.Domicilio;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long>{
    
}
