package com.example.polisback.services;

import com.example.polisback.models.Image;
import com.example.polisback.models.Utilisateur;

import java.util.List;

public interface ImageService {
    public List<Image> findAll();

    public Image save(Image entity);

    public void delete(String id);

    public Image putImage(Image image);
}
