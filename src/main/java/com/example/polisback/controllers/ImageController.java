package com.example.polisback.controllers;

import com.example.polisback.models.Image;
import com.example.polisback.services.ImageService;
import com.example.polisback.services.LieuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("images")
public class ImageController {
    private ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping
    public List<Image> findAll(){
        return this.imageService.findAll();
    }

    @PostMapping
    public Image save(@RequestBody Image entity) {
        return this.imageService.save(entity);
    }
}
