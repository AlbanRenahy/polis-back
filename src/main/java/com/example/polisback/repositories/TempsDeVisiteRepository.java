package com.example.polisback.repositories;

import com.example.polisback.models.Lieu;
import com.example.polisback.models.TempsDeVisite;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TempsDeVisiteRepository extends MongoRepository<TempsDeVisite, String> {
    public TempsDeVisite findById(Long id);
}
