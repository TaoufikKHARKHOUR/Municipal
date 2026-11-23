package com.example.municipal.repositories;

import com.example.municipal.entities.Citoyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CitoyenRepository extends JpaRepository<Citoyen, Long> {
     Optional<Citoyen> findByIdAdministratif(String idAdministratif);
}