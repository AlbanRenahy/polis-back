package com.example.polisback.repositories;

import com.example.polisback.models.Commentaire;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {

    @Query("SELECT c FROM Commentaire c ORDER BY c.dateAjout DESC")
    List<Commentaire> findAllCommentaireOrderByDateAjoutDesc();

    @Query("SELECT c FROM Commentaire c ORDER BY c.dateAjout")
    List<Commentaire> findAllCommentaireOrderByDateAjoutAsc();
}
