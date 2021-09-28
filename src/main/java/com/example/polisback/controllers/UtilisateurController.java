package com.example.polisback.controllers;

import com.example.polisback.models.Utilisateur;
import com.example.polisback.services.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("utilisateurs")
public class UtilisateurController {
    private UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("")
    public List<Utilisateur> findAll() {
        return this.utilisateurService.findAll();
    }

    @PostMapping("")
    public Utilisateur save(@RequestBody Utilisateur entity) {
        return this.utilisateurService.save(entity);
    }

    @GetMapping("{id}")
    public Optional<Utilisateur> getOneUserById(@PathVariable Long id) {
        return utilisateurService.getOneUserById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.utilisateurService.delete(id);
    }

    @PutMapping("")
    public Utilisateur putUtilisateur(@RequestBody Utilisateur utilisateur) {
        return this.utilisateurService.putUtilisateur(utilisateur);
    }


}
