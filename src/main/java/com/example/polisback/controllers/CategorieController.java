package com.example.polisback.controllers;

import com.example.polisback.models.Categorie;
import com.example.polisback.services.CategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("categories")
public class CategorieController {

    private CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }


    @GetMapping("")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @PostMapping("")
    public Categorie save(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }

    @PutMapping("")
    public Categorie putCategorie(@RequestBody Categorie categorie) {
        return categorieService.putCategorie(categorie);
    }

    @GetMapping("{id}")
    public Optional<Categorie> findById(@PathVariable Long id) {
        return categorieService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        categorieService.deleteById(id);
    }
}
