package com.example.polisback.controllers;

import com.example.polisback.models.Lieu;
import com.example.polisback.models.TempsDeVisite;
import com.example.polisback.services.LieuService;
import com.example.polisback.services.TempsDeVisiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("tempsDeVisite")
public class TempsDeVisiteController {

    private TempsDeVisiteService tempsDeVisiteService;

    public TempsDeVisiteController(LieuService lieuService) {
        this.tempsDeVisiteService = tempsDeVisiteService;
    }

    @GetMapping
    public List<TempsDeVisite> findAll(){
        return this.tempsDeVisiteService.findAll();
    }

    @PostMapping
    public TempsDeVisite save(@RequestBody TempsDeVisite tempsDeVisite) {
        return this.tempsDeVisiteService.save(tempsDeVisite);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.tempsDeVisiteService.delete(id);
    }

    @PutMapping
    public TempsDeVisite putTempsDeVisite(@RequestBody TempsDeVisite tempsDeVisite){
        return this.tempsDeVisiteService.putTempsDeVisite(tempsDeVisite);
    }

    @GetMapping("{nom}")
    public TempsDeVisite findById(@PathVariable Long id){
        return this.tempsDeVisiteService.findById(id);
    }

}
