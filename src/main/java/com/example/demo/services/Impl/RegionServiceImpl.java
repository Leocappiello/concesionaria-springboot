package com.example.demo.services.Impl;

import com.example.demo.models.Region;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.RegionRepository;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionServiceImpl extends BaseServiceImpl<Region, Long> implements RegionService {
    @Autowired
    private RegionRepository regionRepository;

    public RegionServiceImpl(BaseRepository<Region, Long> baseRepository) {
        super(baseRepository);
    }
}
