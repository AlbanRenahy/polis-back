package com.example.polisback.controllers;

import com.example.polisback.models.Lieu;
import com.example.polisback.services.LieuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("lieux")
public class LieuController {
    private LieuService lieuService;

    public LieuController(LieuService lieuService) {
        this.lieuService = lieuService;
    }

    @GetMapping("")
    public List<Lieu> findAll(){
        return this.lieuService.findAll();
    }

    @PostMapping("")
    public Lieu save(@RequestBody Lieu lieu) {
        return this.lieuService.save(lieu);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.lieuService.delete(id);
    }

    @PutMapping("")
    public Lieu putLieu(@RequestBody Lieu lieu){
        return this.lieuService.putLieu(lieu);
    }


    @GetMapping("/trierId")
    public List<Lieu> orderByIdLieu() {
        return lieuService.orderByIdLieu();
    }

    @GetMapping("/trierLieu")
    public List<Lieu> orderByNomLieu() {
        return lieuService.orderByNomLieu();
    }

    @GetMapping("/trierVille")
    public List<Lieu> orderByVille() {
        return lieuService.orderByVille();
    }

    @GetMapping("/cat/{nomCategorie}")
    public List<Lieu> findByCategorie(@PathVariable String nomCategorie) {
        return this.lieuService.findByCategorie(nomCategorie);
        //TODO a revoir
    }

    @GetMapping("{id}")
    public Optional<Lieu> findById(@PathVariable Long id){
        return this.lieuService.findById(id);
    }


}


