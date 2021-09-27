package com.example.polisback.services;

import com.example.polisback.models.Image;
import com.example.polisback.repositories.ImageRepository;

import java.util.List;

public class ImageServiceImpl implements ImageService{
    private ImageRepository repository;

    public ImageServiceImpl(ImageRepository repository){
        this.repository = repository;
    }
    @Override
    public List<Image> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Image save(Image entity) {
        return this.repository.save(entity);
    }
}
