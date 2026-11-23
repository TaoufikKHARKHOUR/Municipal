package com.example.municipal.controller;

import com.example.municipal.entities.Citoyen;
import com.example.municipal.service.CitoyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitoyenController {
    @Autowired
    CitoyenService cs;
    @GetMapping("/citoyen")
    public List<Citoyen> getCitoyens() {return cs.getCitoyens();}
    @PostMapping("/citoyen")
    public Citoyen addCitoyen(@RequestBody Citoyen c) {
        return cs.addCitoyen(c);
    }

}
