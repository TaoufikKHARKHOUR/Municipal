package com.example.municipal.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citoyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // clé primaire auto-générée
    private String idAdministratif;
    private String nom;
    private String prenom;
    private String email;
    @OneToMany(mappedBy = "citoyen", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Reclamation> reclamations;
}