package com.example.polisback.services;

import com.example.polisback.models.Lieu;

import java.util.List;
import java.util.Optional;

public interface LieuService {
    public List<Lieu> findAll();

    public Lieu save(Lieu lieu);

    public void delete(Long id);

    public Lieu putLieu(Lieu lieu);

    public Lieu findByNomLieu(String nomLieu);
    //A REVOIR
    public List<Lieu> findByCategorie(String nomCategorie);

    public List<Lieu> orderByIdLieu();

    public List<Lieu> orderByNomLieu();

    public List<Lieu> orderByVille();

    public Optional <Lieu> findById(Long id);

}
