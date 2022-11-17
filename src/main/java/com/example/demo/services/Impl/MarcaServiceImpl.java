package com.example.demo.services.Impl;

import com.example.demo.models.Domicilio;
import com.example.demo.models.Marca;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.DomicilioRepository;
import com.example.demo.repository.MarcaRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.DomicilioService;
import com.example.demo.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaServiceImpl extends BaseServiceImpl<Marca, Long> implements MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public MarcaServiceImpl(BaseRepository<Marca, Long> baseRepository) {
        super(baseRepository);
    }
}
