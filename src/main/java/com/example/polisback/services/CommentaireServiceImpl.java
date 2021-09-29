package com.example.polisback.services;

import com.example.polisback.models.Commentaire;
import com.example.polisback.repositories.CommentaireRepository;
import org.springframework.data.domain.Sort;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class CommentaireServiceImpl implements CommentaireService {

    private CommentaireRepository commentaireRepository;

    public CommentaireServiceImpl(CommentaireRepository commentaireRepository) {
        this.commentaireRepository = commentaireRepository;
    }

    @Override
    public List<Commentaire> findAll() {
        return this.commentaireRepository.findAll();
    }

    @Override
    public List<Commentaire> findAllCommentaireOrderByDateAjoutDesc() { return this.commentaireRepository.findAllCommentaireOrderByDateAjoutDesc(); }

    @Override
    public List<Commentaire> findAllCommentaireOrderByDateAjoutAsc() { return this.commentaireRepository.findAllCommentaireOrderByDateAjoutAsc(); }

    @Override
    public Commentaire save(Commentaire commentaire) {
        return this.commentaireRepository.save(commentaire);
    }

    @Override
    public Commentaire putCommentaire(Commentaire commentaire) {
        return this.commentaireRepository.save(commentaire);
    }

    @Override
    public Optional<Commentaire> findById(Long id) {
        return this.commentaireRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        this.commentaireRepository.deleteById(id);

    }
}
