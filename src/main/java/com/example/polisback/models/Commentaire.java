package com.example.polisback.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Commentaire")
@Data
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "contenu")
    private String contenu;

    @CreationTimestamp
    @Column(name = "dateAjout",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAjout;


    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="COMMENTAIRE_ID")
    private Set<Utilisateur> utilisateurs;

    @ManyToOne( cascade = CascadeType.ALL )
    @JoinColumn( name="LIEU_ID" )
    private Lieu lieu;


}
