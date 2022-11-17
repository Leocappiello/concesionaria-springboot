package com.example.demo.controllers;

import com.example.demo.models.Ano;
import com.example.demo.models.Cliente;
import com.example.demo.services.Impl.AnoServiceImpl;
import com.example.demo.services.Impl.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/ano")
public class AnoController extends BaseControllerImpl<Ano, AnoServiceImpl>{
}
