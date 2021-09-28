package com.example.polisback.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Commentaire")
@Data
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "contenu")
    private String contenu;

    @Column(name = "dateAjout")
    private Date dateAjout;


    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="COMMENTAIRE_ID")
    private Set<Utilisateur> utilisateurs;

    @ManyToOne( cascade = CascadeType.ALL )
    @JoinColumn( name="LIEU_ID" )
    private Lieu lieu;


}
