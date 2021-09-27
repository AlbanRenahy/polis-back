package com.example.polisback.services;

import com.example.polisback.models.Lieu;
import com.example.polisback.models.TempsDeVisite;

import java.util.List;

public interface TempsDeVisiteService {
    public List<TempsDeVisite> findAll();

    public TempsDeVisite save(TempsDeVisite tempsDeVisite);

    public void delete(String id);

    public TempsDeVisite putTempsDeVisite(TempsDeVisite tempsDeVisite);

    public TempsDeVisite findById(Long id);
}
