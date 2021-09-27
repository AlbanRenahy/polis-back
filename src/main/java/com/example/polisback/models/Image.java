package com.example.polisback.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(
      name = "image"
)
@Data
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nomImage")
    private String nomImage;
}
