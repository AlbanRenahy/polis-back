package com.example.polisback.services;

import com.example.polisback.repositories.UtilisateurRepository;

import java.util.List;

public class UtilisateurServiceImpl implements UtilisateurService{
    private UtilisateurRepository utilisateurRepository;

    public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public List<UtilisateurService> findAll() {
        return null;
    }

    @Override
    public UtilisateurService putLieu(UtilisateurService UtilisateurService) {
        return null;
    }

    @Override
    public UtilisateurService save(UtilisateurService UtilisateurService) {
        return null;
    }

    @Override
    public UtilisateurService findByNomUtilisateur(String nomLieu) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
