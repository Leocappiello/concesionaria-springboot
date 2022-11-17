package com.example.demo.controllers;

import com.example.demo.models.Marca;
import com.example.demo.services.Impl.MarcaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/marca")
public class MarcaController extends BaseControllerImpl<Marca, MarcaServiceImpl>{
}
