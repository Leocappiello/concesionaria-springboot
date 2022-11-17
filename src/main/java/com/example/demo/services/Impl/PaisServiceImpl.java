package com.example.demo.services.Impl;

import com.example.demo.models.Cliente;
import com.example.demo.models.Pais;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.PaisRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.ClienteService;
import com.example.demo.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl extends BaseServiceImpl<Pais, Long> implements PaisService {
    @Autowired
    private PaisRepository paisRepository;

    public PaisServiceImpl(BaseRepository<Pais, Long> baseRepository) {
        super(baseRepository);
    }
}
