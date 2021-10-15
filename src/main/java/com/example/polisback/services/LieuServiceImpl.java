package com.example.polisback.services;

import com.example.polisback.models.Lieu;
import com.example.polisback.repositories.LieuRepository;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

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
    public void delete(Long id) {
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

    @Override
    public List<Lieu> findByCategorie(String nomCategorie) {
        return this.lieuRepository.findByCategorie(nomCategorie);
    }

    public List<Lieu> orderByIdLieu() {
        return this.lieuRepository.findAll(Sort.by("ID"));
    }
  
    public List<Lieu> orderByNomLieu() {
        return this.lieuRepository.findAll(Sort.by("nomLieu"));
    }

    @Override
    public List<Lieu> orderByVille() {
        return this.lieuRepository.findAll(Sort.by("ville"));
    }

    @Override
    public Optional<Lieu> findById(Long id) {
        return this.lieuRepository.findById(id);
    }


}
