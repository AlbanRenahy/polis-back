package com.example.polisback.services;

import com.example.polisback.models.TempsDeVisite;

import java.util.Date;
import java.util.List;

public interface TempsDeVisiteService {
    public List<TempsDeVisite> findAll();

    public TempsDeVisite save(TempsDeVisite tempsDeVisite);

    public void delete(Long id);

    public TempsDeVisite putTempsDeVisite(TempsDeVisite tempsDeVisite);

    public TempsDeVisite findByHoraireVisite(String horaireVisite);
}
