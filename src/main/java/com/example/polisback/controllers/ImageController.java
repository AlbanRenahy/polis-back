package com.example.polisback.controllers;

import com.example.polisback.models.Image;
import com.example.polisback.services.ImageService;
import com.example.polisback.services.LieuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(name = "image")
public class ImageController {
    private ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/Image/findAll")
    public List<Image> findAll(){
        return this.imageService.findAll();
    }

    @PostMapping("/Image/save")
    public Image save(@RequestBody Image entity) {
        return this.imageService.save(entity);
    }
}
