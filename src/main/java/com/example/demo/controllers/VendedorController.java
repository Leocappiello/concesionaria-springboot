package com.example.demo.controllers;

import com.example.demo.models.Vendedor;
import com.example.demo.services.Impl.VendedorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/vendedor")
public class VendedorController extends BaseControllerImpl<Vendedor, VendedorServiceImpl>{
}
