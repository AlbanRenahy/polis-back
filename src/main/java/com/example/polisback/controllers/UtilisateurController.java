package com.example.polisback.controllers;

import com.example.polisback.models.Image;
import com.example.polisback.models.Utilisateur;
import com.example.polisback.services.ImageService;
import com.example.polisback.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(name = "utilisateur")
public class UtilisateurController {
    private UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("/Utilisateur/findAll")
    public List<Utilisateur> findAll(){
        return this.utilisateurService.findAll();
    }

    @PostMapping("/Utilisateur/save")
    public Utilisateur save(@RequestBody Utilisateur entity) {
        return this.utilisateurService.save(entity);
    }
}
