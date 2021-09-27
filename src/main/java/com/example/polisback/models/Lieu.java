package com.example.polisback.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Lieu {
    @Id
    private String id;
    private double latitude;
    private double longitude;
    @Column(length = 255)
    private String nomLieu;
    @Column(length = 255)
    private String adresse;
    @Column(length = 500)
    private String description;
    @Column(length = 255)
    private String ville;
    @Column(length = 500)
    private String note;


}
