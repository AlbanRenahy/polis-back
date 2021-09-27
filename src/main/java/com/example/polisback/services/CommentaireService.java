package com.example.polisback.services;

import com.example.polisback.models.Commentaire;

import java.util.List;
import java.util.Optional;

public interface CommentaireService {
    public List<Commentaire> findAll();

    public Commentaire save(Commentaire commentaire);

    public Commentaire putCommentaire(Commentaire commentaire);

    public Optional<Commentaire> findById(Long id);

    public void delete(Long id);
}
