package com.example.polisback.repositories;

import com.example.polisback.models.Lieu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LieuRepository extends MongoRepository<Lieu, String> {
    public Lieu findByNomLieu(String nomLieu);
}
