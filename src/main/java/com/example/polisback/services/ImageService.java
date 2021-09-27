package com.example.polisback.services;

import java.util.List;

public interface ImageService {
    public List<ImageService> findAll();

    public ImageService putImage(ImageService ImageService);

    public ImageService save(ImageService ImageService);

    public void delete(String id);
}
