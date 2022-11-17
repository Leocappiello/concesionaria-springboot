package com.example.demo.services.Impl;

import com.example.demo.models.Auto;
import com.example.demo.models.Color;
import com.example.demo.repository.AutoRepository;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.ColorRepository;
import com.example.demo.services.AutoService;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorServiceImpl extends BaseServiceImpl<Color, Long> implements ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public ColorServiceImpl(BaseRepository<Color, Long> baseRepository){
        super(baseRepository);
    }
}
