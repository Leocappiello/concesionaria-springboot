package com.example.demo.controllers;

import com.example.demo.models.Venta;
import com.example.demo.services.Impl.VentaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/venta")
public class VentaController extends BaseControllerImpl<Venta, VentaServiceImpl>{
}
