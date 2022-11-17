package com.example.demo.controllers;

import com.example.demo.models.Color;
import com.example.demo.services.Impl.ColorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/color")
public class ColorController extends BaseControllerImpl<Color, ColorServiceImpl>{
}
