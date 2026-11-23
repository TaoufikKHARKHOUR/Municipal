package com.example.municipal.service;

import com.example.municipal.entities.Reclamation;
import com.example.municipal.repositories.ReclamationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReclamationService {
    @Autowired
    ReclamationRepository rr;
    @Transactional
    public List<Reclamation> getReclamations() {
        return rr.findAll();
    }
    @Transactional
    public void addReclamation(Reclamation r) {
            rr.save(r);
    }
    @Transactional
    public List<Reclamation> getReclamationsByCitoyenId(Long citoyenId) {
        return rr.findByCitoyenId(citoyenId);
    }
    @Transactional
    public Reclamation save(Reclamation r) {
        return rr.save(r);
    }
    @Transactional
    public Reclamation findById(Long id) {
        return rr.findById(id).orElse(null);
    }
}
