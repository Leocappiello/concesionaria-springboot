package com.example.demo.services.Impl;

import com.example.demo.models.Localidad;
import com.example.demo.repository.BaseRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.LocalidadService;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository){
        super(baseRepository);
    }
}
