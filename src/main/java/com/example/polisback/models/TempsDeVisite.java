package com.example.polisback.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
@Entity
@Table(name="tempsDeVisite")
public class TempsDeVisite {
    @Id
    private Long id;
    private Date horaireVisite;

}
