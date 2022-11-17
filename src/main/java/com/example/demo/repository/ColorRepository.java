package com.example.demo.repository;

import com.example.demo.models.Cliente;
import com.example.demo.models.Color;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends BaseRepository<Color, Long>{
    
}
