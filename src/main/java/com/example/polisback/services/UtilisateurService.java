package com.example.polisback.services;

import com.example.polisback.models.Image;
import com.example.polisback.models.TempsDeVisite;
import com.example.polisback.models.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    public List<Utilisateur> findAll();

    public Utilisateur save(Utilisateur entity);

    public void delete(String id);

    public Utilisateur putUtilisateur(Utilisateur utilisateur);

}
