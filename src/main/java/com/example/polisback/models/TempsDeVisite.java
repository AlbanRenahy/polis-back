package com.example.polisback.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TempsDeVisite")
public class TempsDeVisite {
    @Id
    private Long id;
    @Column(name = "horaireVisite")
    private Date horaireVisite;

}
