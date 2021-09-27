package com.example.polisback.services;

import com.example.polisback.models.Image;

import java.util.List;

public interface ImageService {
    public List<Image> findAll();

    public Image save(Image entity);
}
