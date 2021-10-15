package com.example.polisback.controllers;

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

    public TempsDeVisiteController(TempsDeVisiteService tempsDeVisiteService) {
        this.tempsDeVisiteService = tempsDeVisiteService;
    }

    @GetMapping("")
    public List<TempsDeVisite> findAll(){
        return this.tempsDeVisiteService.findAll();
    }

    @PostMapping("")
    public TempsDeVisite save(@RequestBody TempsDeVisite tempsDeVisite) {
        return this.tempsDeVisiteService.save(tempsDeVisite);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.tempsDeVisiteService.delete(id);
    }

    @PutMapping("")
    public TempsDeVisite putTempsDeVisite(@RequestBody TempsDeVisite tempsDeVisite){
        return this.tempsDeVisiteService.putTempsDeVisite(tempsDeVisite);
    }

    @GetMapping("{horaireVisite}")
    public TempsDeVisite findByHoraireVisite(@PathVariable String horaireVisite){
        return this.tempsDeVisiteService.findByHoraireVisite(horaireVisite);
    }
    /*TODO : methode findByHoraireVisite a reverifier*/

}
