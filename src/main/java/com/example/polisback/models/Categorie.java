package com.example.polisback.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "categorie")
@Data
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nomCategorie")
    private String nomCategorie;
}
