package com.example.polisback.repositories;

import com.example.polisback.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository  extends JpaRepository<Image, Long> {

}
