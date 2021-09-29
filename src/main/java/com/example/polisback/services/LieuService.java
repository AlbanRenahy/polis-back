package com.example.polisback.services;

import com.example.polisback.models.Lieu;

import java.util.List;

public interface LieuService {
    public List<Lieu> findAll();

    public Lieu save(Lieu lieu);

    public void delete(Long id);

    public Lieu putLieu(Lieu lieu);

    public Lieu findByNomLieu(String nomLieu);



    public List<Lieu> orderByNomLieu();

    public List<Lieu> orderByVille();


}
