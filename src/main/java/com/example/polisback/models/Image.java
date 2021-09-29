package com.example.polisback.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Image")
@Data
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "nomImage")
    private String nomImage;

    @ManyToOne
    @JoinColumn(name="lieu_id", referencedColumnName = "id")
    private Lieu lieu;


}
