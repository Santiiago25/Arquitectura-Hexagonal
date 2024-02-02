package com.hexagonal.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tareas")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTarea")
    private Long id;

    @Column(name = "titulo")
    private String title;

    @Column(name = "descrpcion")
    private String description;

    @Column(name = "creacionFecha")
    private LocalDateTime creationDate;

    @Column(name = "completado")
    private boolean completed;

}
