package com.example.polisback.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    @Column(name = "ID")
    private Long id;

    @Column(name = "contenu")
    private String contenu;

    @CreationTimestamp
    @Column(name = "dateAjout",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ",shape = JsonFormat.Shape.STRING)
    private Date dateAjout;


    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="COMMENTAIRE_ID")
    private Set<Utilisateur> utilisateurs;

    @JsonBackReference
    @ManyToOne( cascade = CascadeType.ALL )
    @JoinColumn( name="LIEU_ID" )
    private Lieu lieu;


}
