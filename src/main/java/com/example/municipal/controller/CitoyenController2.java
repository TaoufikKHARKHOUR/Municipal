package com.example.municipal.controller;

import com.example.municipal.entities.Administrateur;
import com.example.municipal.entities.Citoyen;
import com.example.municipal.entities.Reclamation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CitoyenController2 {
    @GetMapping("/formcitoyen")
    public String formCitoyen(Model model) {
        model.addAttribute("citoyen", new Citoyen());
        return "citoyen-form";
    }
    @GetMapping("/formreclamation")
    public String formReclamation(
            @RequestParam Long citoyenId,
            Model model) {

        Reclamation reclamation = new Reclamation();

        model.addAttribute("reclamation", reclamation);
        model.addAttribute("citoyenId", citoyenId);

        return "reclamation-form";
    }
    @GetMapping("/authentification")
    public String authentification(Model model) {
            model.addAttribute("admin", new Administrateur());
            return "login";
    }
    @GetMapping("/admin/reclamations")
    public String pageReclamations() {
        return "reclamations";
    }


}
