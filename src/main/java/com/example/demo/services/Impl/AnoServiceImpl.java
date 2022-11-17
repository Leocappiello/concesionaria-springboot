package com.example.demo.services.Impl;

import com.example.demo.models.Ano;
import com.example.demo.models.Auto;
import com.example.demo.repository.AnoRepository;
import com.example.demo.repository.AutoRepository;
import com.example.demo.repository.BaseRepository;
import com.example.demo.services.AnoService;
import com.example.demo.services.AutoService;
import com.example.demo.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnoServiceImpl extends BaseServiceImpl<Ano, Long> implements AnoService {

    @Autowired
    private AnoRepository anoRepository;

    public AnoServiceImpl(BaseRepository<Ano, Long> baseRepository){
        super(baseRepository);
    }
}
