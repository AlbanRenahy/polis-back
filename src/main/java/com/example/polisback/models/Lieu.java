package com.example.polisback.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
@Entity
@Table(name="lieu")
public class Lieu {
    @Id
    private Long id;
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

    @OneToOne
    @JoinColumn(name="TempsDeVisite_id")
    private TempsDeVisite tempsDeVisite;

    @OneToMany (mappedBy = "lieu")
    private Set<Utilisateur> utilisateurs;

    @OneToMany (mappedBy = "lieu")
    private Set<Image> images;

}
