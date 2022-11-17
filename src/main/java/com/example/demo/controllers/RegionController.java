package com.example.demo.controllers;

import com.example.demo.models.Region;
import com.example.demo.services.Impl.RegionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/region")
public class RegionController extends BaseControllerImpl<Region, RegionServiceImpl>{
}
