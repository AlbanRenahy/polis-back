package com.example.polisback.controllers;

import com.example.polisback.models.Categorie;
import com.example.polisback.services.CategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(name = "categorie")
public class CategorieController {

    private CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping("/Categorie/findAll")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @PostMapping("/Categorie/save")
    public Categorie save(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }

    @PutMapping("")
    public Categorie putCategorie(@RequestBody Categorie categorie) {
        return categorieService.putCategorie(categorie);
    }

    @GetMapping("/Categorie/{id}")
    public Optional<Categorie> findById(Long id) {
        return categorieService.findById(id);
    }

    @DeleteMapping("/Categorie/{id}")
    public void deleteById(@PathVariable Long id) {
        categorieService.deleteById(id);
    }
}
