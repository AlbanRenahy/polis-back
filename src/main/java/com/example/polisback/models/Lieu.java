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
@Entity
@Table(name="Lieu")
public class Lieu {
    @Id
    private Long id;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longitude")
    private double longitude;
    @Column(length = 255,name = "nomLieu")
    private String nomLieu;
    @Column(length = 255,name = "adresse")
    private String adresse;
    @Column(length = 500,name = "description")
    private String description;
    @Column(length = 255, name = "ville")
    private String ville;
    @Column(length = 500,name = "note")
    private String note;


    @OneToMany (mappedBy = "lieu")
    private Set<Utilisateur> utilisateurs;

    @OneToMany (mappedBy = "lieu")
    private Set<Image> images;
}
