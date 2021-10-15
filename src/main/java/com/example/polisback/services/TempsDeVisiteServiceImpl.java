package com.example.polisback.services;

import com.example.polisback.models.Lieu;
import com.example.polisback.models.TempsDeVisite;
import com.example.polisback.repositories.LieuRepository;
import com.example.polisback.repositories.TempsDeVisiteRepository;

import java.util.Date;
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
    public void delete(Long id) {
        this.tempsDeVisiteRepository.deleteById(id);
    }

    @Override
    public TempsDeVisite putTempsDeVisite(TempsDeVisite tempsDeVisite)  {
        return this.tempsDeVisiteRepository.save(tempsDeVisite);
    }

    @Override
    public TempsDeVisite findByHoraireVisite(String horaireVisite) {
        TempsDeVisite tempsDeVisite = this.tempsDeVisiteRepository.findByHoraireVisite(horaireVisite);
        tempsDeVisite.setId(tempsDeVisite.getId());
        return tempsDeVisite;
    }
}
