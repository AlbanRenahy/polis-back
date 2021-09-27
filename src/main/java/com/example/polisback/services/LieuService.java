package com.example.polisback.services;

import java.util.List;

public interface LieuService {
    public List<LieuService> findAll();

    public LieuService putLieu(LieuService lieuService);

    public LieuService save(LieuService lieuService);

    public LieuService findByNomLieu(String nomLieu);

    public void delete(String id);
}
