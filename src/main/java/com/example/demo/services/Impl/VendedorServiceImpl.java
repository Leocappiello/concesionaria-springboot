package com.example.demo.services.Impl;

import com.example.demo.models.Cliente;
import com.example.demo.models.Vendedor;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.VendedorRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.ClienteService;
import com.example.demo.services.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorServiceImpl extends BaseServiceImpl<Vendedor, Long> implements VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;

    public VendedorServiceImpl(BaseRepository<Vendedor, Long> baseRepository) {
        super(baseRepository);
    }
}
