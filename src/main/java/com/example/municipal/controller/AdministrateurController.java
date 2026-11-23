package com.example.municipal.controller;

import com.example.municipal.entities.Administrateur;
import com.example.municipal.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdministrateurController {
    @Autowired
    AdministrateurService as;
    @GetMapping("/administrateur")
    public List<Administrateur> getAdministrateurs() {return as.getAdministrateurs();}
    @PostMapping("/administrateur")
    public void addAdministrateur(@RequestBody Administrateur a) {as.addAdministrateur(a);}
}
