package com.example.polisback.controllers;

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
    public List<LieuService> findAll(){
        return this.lieuService.findAll();
    }

    @PostMapping
    public LieuService save(@RequestBody LieuService lieuService) {
        return this.lieuService.save(lieuService);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.lieuService.delete(id);
    }

    @PutMapping
    public LieuService putLieu(@RequestBody LieuService lieuService){
        return this.lieuService.putLieu(lieuService);
    }

    @GetMapping("{nom}")
    public LieuService findByNomLieu(@PathVariable String nomLieu){
        return this.lieuService.findByNomLieu(nomLieu);
    }
}


