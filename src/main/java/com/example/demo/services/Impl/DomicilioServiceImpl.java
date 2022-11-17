package com.example.demo.services.Impl;

import com.example.demo.models.Cliente;
import com.example.demo.models.Domicilio;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.DomicilioRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.ClienteService;
import com.example.demo.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {
    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
