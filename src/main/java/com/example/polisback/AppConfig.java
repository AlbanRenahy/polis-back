package com.example.polisback;

import com.example.polisback.repositories.*;
import com.example.polisback.repositories.LieuRepository;
import com.example.polisback.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LieuService lieuService(LieuRepository lieuRepository){
        return new LieuServiceImpl(lieuRepository);
    }

    @Bean
    public TempsDeVisiteService tempsDeVisiteService(TempsDeVisiteRepository tempsDeVisiteRepository){
        return new TempsDeVisiteServiceImpl(tempsDeVisiteRepository);
    }

    @Bean
    public ImageService imageService(ImageRepository imageRepository){
        return new ImageServiceImpl(imageRepository);
    }

    @Bean
    public UtilisateurService utilisateurService(UtilisateurRepository utilisateurRepository){
        return new UtilisateurServiceImpl(utilisateurRepository);
    }

    @Bean
    public CommentaireService commentaireService(CommentaireRepository commentaireRepository){
        return new CommentaireServiceImpl(commentaireRepository);
    }

    @Bean
    public CategorieService categorieService(CategorieRepository categorieRepository){
        return new CategorieServiceImpl(categorieRepository);
    }
}
