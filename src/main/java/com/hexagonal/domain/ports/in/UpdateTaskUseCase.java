package com.hexagonal.domain.ports.in;

import com.hexagonal.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}
