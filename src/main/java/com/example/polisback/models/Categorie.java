package com.example.polisback.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Categorie")
@Data
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "nomCategorie")
    private String nomCategorie;
}
