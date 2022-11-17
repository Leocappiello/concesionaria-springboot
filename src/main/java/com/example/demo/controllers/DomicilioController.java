package com.example.demo.controllers;

import com.example.demo.models.Color;
import com.example.demo.models.Domicilio;
import com.example.demo.services.Impl.ColorServiceImpl;
import com.example.demo.services.Impl.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/domicilio")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{
}
