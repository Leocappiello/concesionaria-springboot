package com.example.demo.controllers;

import com.example.demo.models.Modelo;
import com.example.demo.services.Impl.ModeloServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/modelo")
public class ModeloController extends BaseControllerImpl<Modelo, ModeloServiceImpl>{

}
