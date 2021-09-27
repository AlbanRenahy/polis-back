package com.example.polisback.repositories;

import com.example.polisback.models.TempsDeVisite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;


public interface TempsDeVisiteRepository extends JpaRepository<TempsDeVisite, Long> {

    public void deleteById(String id);

    TempsDeVisite findByHoraireVisite(Date horaireVisite);
}
