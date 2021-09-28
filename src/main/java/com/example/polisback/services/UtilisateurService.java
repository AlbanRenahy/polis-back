package com.example.polisback.services;

import com.example.polisback.models.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurService {
    public List<Utilisateur> findAll();

    public Utilisateur save(Utilisateur entity);

    public Optional<Utilisateur> getOneUserById(Long id);

    public void delete(Long id);

    public Utilisateur putUtilisateur(Utilisateur utilisateur);

}
