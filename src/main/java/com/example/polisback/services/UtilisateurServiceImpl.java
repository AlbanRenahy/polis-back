package com.example.polisback.services;

import com.example.polisback.models.Utilisateur;
import com.example.polisback.repositories.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

public class UtilisateurServiceImpl implements UtilisateurService {
    private UtilisateurRepository repository;

    public UtilisateurServiceImpl(UtilisateurRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Utilisateur> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Utilisateur save(Utilisateur entity) {
        return this.repository.save(entity);
    }

    @Override
    public Optional<Utilisateur> getOneUserById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Utilisateur putUtilisateur(Utilisateur utilisateur) {
        return this.repository.save(utilisateur);
    }
}
