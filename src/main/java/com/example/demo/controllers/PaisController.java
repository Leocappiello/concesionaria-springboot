package com.example.demo.controllers;

import com.example.demo.models.Pais;
import com.example.demo.services.Impl.PaisServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/pais")
public class PaisController extends BaseControllerImpl<Pais, PaisServiceImpl>{

}
