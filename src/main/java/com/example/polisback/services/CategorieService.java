package com.example.polisback.services;

import com.example.polisback.models.Categorie;

import java.util.List;
import java.util.Optional;

public interface CategorieService {

    public List<Categorie> findAll();

    public Categorie save(Categorie categorie);

    public Categorie putCategorie(Categorie categorie);

    public Optional<Categorie> findById(Long id);

    public void deleteById(Long id);
}
