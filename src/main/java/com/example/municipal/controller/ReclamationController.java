package com.example.municipal.controller;

import com.example.municipal.entities.Reclamation;
import com.example.municipal.service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReclamationController {
    @Autowired
    ReclamationService rs;
    @GetMapping("/reclamation")
    public List<Reclamation> getReclamations() {
        return rs.getReclamations();
    }
    @PostMapping("/reclamation")
    public void addReclamation(@RequestBody Reclamation r) {
            rs.addReclamation(r);
    }
    @GetMapping("/reclamation/{citoyenId}")
    public List<Reclamation> getReclamationsByCitoyenId(@PathVariable Long citoyenId) {
        return rs.getReclamationsByCitoyenId(citoyenId);
    }
    @PutMapping("/reclamationupdate")
    public Reclamation updateReclamation(@RequestBody Reclamation r) {
        Reclamation exist = rs.findById(r.getId());
        // update seulement statut
        exist.setStatut(r.getStatut());
        return rs.save(exist);
    }
}
