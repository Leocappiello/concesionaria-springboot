package com.example.demo.services.Impl;

import com.example.demo.models.Venta;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.VentaRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImpl extends BaseServiceImpl<Venta, Long> implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public VentaServiceImpl(BaseRepository<Venta, Long> baseRepository) {
        super(baseRepository);
    }
}
