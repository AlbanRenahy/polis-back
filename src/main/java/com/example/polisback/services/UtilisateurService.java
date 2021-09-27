package com.example.polisback.services;

import java.util.List;

public interface UtilisateurService {
    public List<UtilisateurService> findAll();

    public UtilisateurService putLieu(UtilisateurService UtilisateurService);

    public UtilisateurService save(UtilisateurService UtilisateurService);

    public UtilisateurService findByNomUtilisateur(String nomLieu);

    public void delete(String id);
}
