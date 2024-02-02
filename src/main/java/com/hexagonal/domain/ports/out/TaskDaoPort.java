package com.hexagonal.domain.ports.out;

import com.hexagonal.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskDaoPort {
    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);
}
