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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="lieu_has_categorie",
            joinColumns = @JoinColumn(name="lieu_id"),
            inverseJoinColumns = @JoinColumn(name="categorie_id")
    )
    private Set<Categorie>categories;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Commentaire> commentaires;



}
