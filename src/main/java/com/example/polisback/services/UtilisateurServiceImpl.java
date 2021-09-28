package com.example.polisback.services;

import com.example.polisback.models.Utilisateur;
import com.example.polisback.repositories.UtilisateurRepository;

import java.util.List;

public class UtilisateurServiceImpl implements UtilisateurService{
    private UtilisateurRepository repository;

    public UtilisateurServiceImpl(UtilisateurRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Utilisateur> findAll() {
        return null;
    }

    @Override
    public Utilisateur save(Utilisateur entity) {
        return this.repository.save(entity);
    }

    @Override
    public void delete(String id) {}

    @Override
    public Utilisateur putUtilisateur(Utilisateur utilisateur) {
        return this.repository.save(utilisateur);
    }
}
