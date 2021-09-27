package com.example.polisback.services;

import com.example.polisback.repositories.LieuRepository;

public class LieuServiceImpl {
    private LieuRepository lieuRepository;

    public LieuServiceImpl(LieuRepository lieuRepository){
        this.lieuRepository = lieuRepository;
    }
}
