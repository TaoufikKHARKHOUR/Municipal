package com.example.municipal.service;

import com.example.municipal.entities.Administrateur;
import com.example.municipal.repositories.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class AdministrateurService {
    @Autowired
    private AdministrateurRepository ar;
    @Transactional
    public List<Administrateur> getAdministrateurs() {
        return ar.findAll();
    }
    @Transactional
    public void addAdministrateur(Administrateur a) {
        ar.save(a);
    }
    @Transactional
    public void deleteAdministrateur(Long id) {
            ar.deleteById(id);
    }
    @Transactional
    public void deleteAdministrateur(Administrateur a) {
            ar.delete(a);
    }
    @Transactional
    public void updateAdministrateur(Administrateur a) {
            if (a.getId() == null || !ar.existsById(a.getId())) {
                  throw new IllegalArgumentException("L'administrateur spécifié n'existe pas.");
            }
            ar.save(a);
    }
}
