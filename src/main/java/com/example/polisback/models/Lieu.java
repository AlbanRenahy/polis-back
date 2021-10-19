package com.example.polisback.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Lieu")
public class Lieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
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
    @Column(length = 500,name = "category")
    private String category;
    @Column(length = 500,name = "tempsVisite")
    private String tempsVisite;
    @Column(length = 500,name = "image")
    private String image;
    @Column(length = 500,name = "region")
    private String region;
    @Column(length = 500,name = "famille")
    private String famille;


    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="LIEU_ID")
    private Set<Utilisateur> utilisateurs;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="LIEU_ID")
    private Set<Image> images;

    @ManyToOne(cascade=CascadeType.ALL)
    private Categorie categorie;

    @JsonManagedReference
    @OneToMany (mappedBy = "lieu")
    private Set<Commentaire> commentaires;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TEMPSDEVISITE_ID", referencedColumnName = "id")
    private TempsDeVisite tempsDeVisite;

}
