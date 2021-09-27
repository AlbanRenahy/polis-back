package com.example.polisback;

import com.example.polisback.repositories.LieuRepository;
import com.example.polisback.services.LieuService;
import com.example.polisback.services.LieuServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LieuService lieuService(LieuRepository lieuRepository){
        return (LieuService) new LieuServiceImpl(lieuRepository);
    }

}
