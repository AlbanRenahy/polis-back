package com.example.polisback.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Utilisateur")
@Data
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name="password")
    private String password;

    @ManyToOne
    @JoinColumn(name="lieu_id", referencedColumnName = "id")
    private Lieu lieu;

    @OneToMany(cascade=CascadeType.ALL)
    private Set<Commentaire> commentaires;


}
