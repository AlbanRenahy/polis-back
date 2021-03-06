package com.example.polisback.controllers;

import com.example.polisback.models.Lieu;
import com.example.polisback.services.LieuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("lieu")
public class LieuController {
    private LieuService lieuService;

    public LieuController(LieuService lieuService) {
        this.lieuService = lieuService;
    }

    @GetMapping
    public List<Lieu> findAll(){
        return this.lieuService.findAll();
    }

    @PostMapping
    public Lieu save(@RequestBody Lieu lieu) {
        return this.lieuService.save(lieu);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.lieuService.delete(id);
    }

    @PutMapping
    public Lieu putLieu(@RequestBody Lieu lieu){
        return this.lieuService.putLieu(lieu);
    }

    @GetMapping("{nom}")
    public Lieu findByNomLieu(@PathVariable String nomLieu){
        return this.lieuService.findByNomLieu(nomLieu);
    }
}


