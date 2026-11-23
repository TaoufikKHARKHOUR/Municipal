package com.example.municipal.service;

import com.example.municipal.entities.Citoyen;
import com.example.municipal.repositories.CitoyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CitoyenService {
    @Autowired
    private CitoyenRepository cr;
    @Autowired
    CitoyenRepository citoyenRepository;
    @Transactional
    public List<Citoyen> getCitoyens() {
        return cr.findAll();
    }
    @Transactional
    public Citoyen addCitoyen(Citoyen c) {

        Optional<Citoyen> existant =
                citoyenRepository.findByIdAdministratif(c.getIdAdministratif());

        if (existant.isPresent()) {
            // 🔴 Citoyen déjà existant
            return existant.get();
        } else {
            // 🟢 Nouveau citoyen
            return citoyenRepository.save(c);
        }
    }
    @Transactional
    public Citoyen updateCitoyen(Citoyen c) {
        return cr.save(c);
    }
}