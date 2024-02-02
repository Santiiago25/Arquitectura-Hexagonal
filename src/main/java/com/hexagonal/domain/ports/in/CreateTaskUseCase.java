package com.hexagonal.domain.ports.in;

import com.hexagonal.domain.model.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
