package com.example.polisback;

import com.example.polisback.repositories.ImageRepository;
import com.example.polisback.repositories.LieuRepository;
import com.example.polisback.repositories.UtilisateurRepository;
import com.example.polisback.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LieuService lieuService(LieuRepository lieuRepository){
        return (LieuService) new LieuServiceImpl(lieuRepository);
    }

    @Bean
    public ImageService imageService(ImageRepository imageRepository){
        return (ImageService) new ImageServiceImpl(imageRepository);
    }

    @Bean
    public UtilisateurService utilisateurService(UtilisateurRepository utilisateurRepository){
        return (UtilisateurService) new UtilisateurServiceImpl(utilisateurRepository);
    }

}
