package com.example.demo.services.Impl;

import com.example.demo.models.Modelo;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ModeloRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModeloServiceImpl extends BaseServiceImpl<Modelo, Long> implements ModeloService {
    @Autowired
    private ModeloRepository modeloRepository;

    public ModeloServiceImpl(BaseRepository<Modelo, Long> baseRepository) {
        super(baseRepository);
    }
}
