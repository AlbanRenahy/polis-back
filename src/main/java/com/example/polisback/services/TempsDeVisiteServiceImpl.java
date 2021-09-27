package com.example.polisback.services;

import com.example.polisback.models.Lieu;
import com.example.polisback.models.TempsDeVisite;
import com.example.polisback.repositories.LieuRepository;
import com.example.polisback.repositories.TempsDeVisiteRepository;

import java.util.List;

public class TempsDeVisiteServiceImpl implements TempsDeVisiteService {

    private TempsDeVisiteRepository tempsDeVisiteRepository;

    public TempsDeVisiteServiceImpl(TempsDeVisiteRepository tempsDeVisiteRepository){
        this.tempsDeVisiteRepository = tempsDeVisiteRepository;
    }
    @Override
    public List<TempsDeVisite> findAll() {
        return this.tempsDeVisiteRepository.findAll();
    }

    @Override
    public TempsDeVisite save(TempsDeVisite tempsDeVisite)  {
        return this.tempsDeVisiteRepository.save(tempsDeVisite);
    }

    @Override
    public void delete(String id) {
        this.tempsDeVisiteRepository.deleteById(id);
    }

    @Override
    public TempsDeVisite putTempsDeVisite(TempsDeVisite tempsDeVisite)  {
        return this.tempsDeVisiteRepository.save(tempsDeVisite);
    }

    @Override
    public TempsDeVisite findById(Long id) {
        TempsDeVisite tempsDeVisite = this.tempsDeVisiteRepository.findById(id);
        tempsDeVisite.setId(tempsDeVisite.getId());
        return tempsDeVisite;
    }
}
