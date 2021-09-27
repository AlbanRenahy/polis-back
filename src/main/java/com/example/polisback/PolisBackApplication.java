package com.example.polisback;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Data
@SpringBootApplication
public class PolisBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolisBackApplication.class, args);
    }

}