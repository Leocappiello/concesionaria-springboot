package com.example.demo.controllers;

import com.example.demo.models.Localidad;
import com.example.demo.services.Impl.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/localidad")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}
