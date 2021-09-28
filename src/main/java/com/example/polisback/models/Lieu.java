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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
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


    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="LIEU_ID")
    private Set<Utilisateur> utilisateurs;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="LIEU_ID")
    private Set<Image> images;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="LIEU_ID")
    private Set<Commentaire> commentaires;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TEMPSDEVISITE_ID", referencedColumnName = "id")
    private TempsDeVisite tempsDeVisite;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="LIEU_ID")
    private Set<Categorie> categories;
}
