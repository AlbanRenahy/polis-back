package com.example.polisback.services;

import com.example.polisback.models.Commentaire;
import org.springframework.data.domain.Sort;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CommentaireService {
    public List<Commentaire> findAll();

    public List<Commentaire> findAllCommentaireOrderByDateAjoutDesc();

    public List<Commentaire> findAllCommentaireOrderByDateAjoutAsc();

    public Commentaire save(Commentaire commentaire);

    public Commentaire putCommentaire(Commentaire commentaire);

    public Optional<Commentaire> findById(Long id);

    public void delete(Long id);


}
