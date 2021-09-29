package com.example.polisback.repositories;

import com.example.polisback.models.Lieu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LieuRepository extends JpaRepository<Lieu, Long> {
    public Lieu findByNomLieu(String nomLieu);

    void deleteById(Long id);
}
