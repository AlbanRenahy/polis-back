package com.example.polisback.repositories;

import com.example.polisback.models.Categorie;
import com.example.polisback.models.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
