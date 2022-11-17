package com.example.demo.controllers;

import com.example.demo.models.Auto;
import com.example.demo.services.Impl.AutoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/auto")
public class AutoController extends BaseControllerImpl<Auto, AutoServiceImpl>{
}
