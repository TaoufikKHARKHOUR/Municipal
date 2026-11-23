package com.example.municipal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reclamation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // clé primaire auto-générée

    private String titre;
    private String description;

    private LocalDateTime datedesoumission = LocalDateTime.now(); // date du jour par défaut

    private String statut = "En attente"; // statut par défaut

    private String adressequartier;
    @ManyToOne(optional = false)
    @JoinColumn(name = "citoyen_id")
    @JsonBackReference
    private Citoyen citoyen;
}

