package com.example.polisback.services;

import com.example.polisback.models.Categorie;
import com.example.polisback.repositories.CategorieRepository;

import java.util.List;
import java.util.Optional;

public class CategorieServiceImpl implements CategorieService {

    private CategorieRepository categorieRepository;

    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }


    @Override
    public List<Categorie> findAll() {
        return this.categorieRepository.findAll();
    }

    @Override
    public Categorie save(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }

    @Override
    public Categorie putCategorie(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }

    @Override
    public Optional<Categorie> findById(Long id) {
        return this.categorieRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        this.categorieRepository.deleteById(id);

    }
}
