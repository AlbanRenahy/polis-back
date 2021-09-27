package com.example.polisback.controllers;

import com.example.polisback.models.Lieu;
import com.example.polisback.services.LieuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(name = "lieu")
public class LieuController {
    private LieuService lieuService;

    public LieuController(LieuService lieuService) {
        this.lieuService = lieuService;
    }

    @GetMapping("/Lieu/findAll")
    public List<Lieu> findAll(){
        return this.lieuService.findAll();
    }

    @PostMapping("/Lieu/save")
    public Lieu save(@RequestBody Lieu lieu) {
        return this.lieuService.save(lieu);
    }

    @DeleteMapping("/Lieu/{id}")
    public void delete(@PathVariable Long id) {
        this.lieuService.delete(id);
    }

    @PostMapping("/putLieu")
    public Lieu putLieu(@RequestBody Lieu lieu){
        return this.lieuService.putLieu(lieu);
    }

    @GetMapping("/Lieu/{nom}")
    public Lieu findByNomLieu(@PathVariable String nomLieu){
        return this.lieuService.findByNomLieu(nomLieu);
    }
}


