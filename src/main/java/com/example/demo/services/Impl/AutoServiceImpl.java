package com.example.demo.services.Impl;

import com.example.demo.models.Auto;
import com.example.demo.repository.AutoRepository;
import com.example.demo.repository.BaseRepository;
import com.example.demo.services.AutoService;
import com.example.demo.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoServiceImpl extends BaseServiceImpl<Auto, Long> implements AutoService {

    @Autowired
    private AutoRepository autoRepository;

    public AutoServiceImpl(BaseRepository<Auto, Long> baseRepository){
        super(baseRepository);
    }
}
