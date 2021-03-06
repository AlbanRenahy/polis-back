package com.example.polisback.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Commentaire")
@Data
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "contenu")
    private String contenu;

    @Column(name = "dateAjout")
    private Date dateAjout;

    /*TODO Ajouter liaison many to one entre commentaire et lieu*/
    @ManyToOne
    @JoinColumn(name = "lieu_id", referencedColumnName = "id")
    private Lieu lieu;
}
