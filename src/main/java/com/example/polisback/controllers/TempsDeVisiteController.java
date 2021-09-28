package com.example.polisback.controllers;

import com.example.polisback.models.Lieu;
import com.example.polisback.models.TempsDeVisite;
import com.example.polisback.services.LieuService;
import com.example.polisback.services.TempsDeVisiteService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("tempsDeVisite")
public class TempsDeVisiteController {

    private TempsDeVisiteService tempsDeVisiteService;

    public TempsDeVisiteController(LieuService lieuService) {
        this.tempsDeVisiteService = tempsDeVisiteService;
    }

    @GetMapping("/findAll")
    public List<TempsDeVisite> findAll(){
        return this.tempsDeVisiteService.findAll();
    }

    @PostMapping("/TempsDeVisite/save")
    public TempsDeVisite save(@RequestBody TempsDeVisite tempsDeVisite) {
        return this.tempsDeVisiteService.save(tempsDeVisite);
    }

    @DeleteMapping("/TempsDeVisite/{id}")
    public void delete(@PathVariable String id) {
        this.tempsDeVisiteService.delete(id);
    }

    @PostMapping("/putTempsDeVisite")
    public TempsDeVisite putTempsDeVisite(@RequestBody TempsDeVisite tempsDeVisite){
        return this.tempsDeVisiteService.putTempsDeVisite(tempsDeVisite);
    }

    @GetMapping("/TempsDeVisite/{horaireVisite}")
    public TempsDeVisite findByHoraireVisite(@PathVariable Date horaireVisite){
        return this.tempsDeVisiteService.findByHoraireVisite(horaireVisite);
    }

}
