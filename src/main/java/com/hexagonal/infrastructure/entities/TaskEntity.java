package com.hexagonal.infrastructure.entities;

import com.hexagonal.domain.model.Task;
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
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo")
    private String title;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "creacionFecha")
    private LocalDateTime creationDate;

    @Column(name = "completado")
    private boolean completed;

    //esta parte se puede sustituir por un mapper
    public static TaskEntity fromDomainModel(Task task){
        return new TaskEntity(task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getCreationDate(),
                task.isCompleted());
    }

    public Task toDomainModel(){
        return new Task(id, title, description, creationDate, completed);
    }

}
