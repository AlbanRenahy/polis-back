package com.example.polisback.repositories;

import com.example.polisback.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository  extends JpaRepository<Utilisateur, Long> {

}
