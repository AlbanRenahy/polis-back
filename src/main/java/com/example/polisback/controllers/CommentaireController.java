package com.example.polisback.controllers;

import com.example.polisback.models.Commentaire;
import com.example.polisback.services.CommentaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(name = "commentaire")
public class CommentaireController {

    private CommentaireService commentaireService;

    public CommentaireController(CommentaireService commentaireService) {
        this.commentaireService = commentaireService;
    }

    @GetMapping("/Commentaire/findAll")
    public List<Commentaire> findAll() {
        return commentaireService.findAll();
    }

    @PostMapping("/Commentaire/save")
    public Commentaire save(@RequestBody Commentaire commentaire) {
        return commentaireService.save(commentaire);
    }

    @PostMapping("/putCommentaire")
    public Commentaire putCommentaire(@RequestBody Commentaire commentaire) {
        return commentaireService.putCommentaire(commentaire);
    }

    @GetMapping("/Commentaire/{id}")
    public Optional<Commentaire> findById(@PathVariable Long id) {
        return commentaireService.findById(id);
    }

    @DeleteMapping("/Commentaire/{id}")
    public void delete(@PathVariable Long id) {
        commentaireService.delete(id);
    }
}
