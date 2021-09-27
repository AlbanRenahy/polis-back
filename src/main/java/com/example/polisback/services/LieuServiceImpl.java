package com.example.polisback.services;

import com.example.polisback.models.Lieu;
import com.example.polisback.repositories.LieuRepository;

import java.util.List;

public class LieuServiceImpl implements LieuService{

    private LieuRepository lieuRepository;

    public LieuServiceImpl(LieuRepository lieuRepository){
        this.lieuRepository = lieuRepository;
    }
    @Override
    public List<Lieu> findAll() {
        return this.lieuRepository.findAll();
    }

    @Override
    public Lieu save(Lieu lieu)  {
        return this.lieuRepository.save(lieu);
    }

    @Override
    public void delete(String id) {
        this.lieuRepository.deleteById(id);
    }

    @Override
    public Lieu putLieu(Lieu lieu)  {
        return this.lieuRepository.save(lieu);
    }

    @Override
    public Lieu findByNomLieu(String nomLieu) {
        Lieu lieu = this.lieuRepository.findByNomLieu(nomLieu);
        lieu.setNomLieu(lieu.getNomLieu().toUpperCase());
        return lieu;
    }
}
