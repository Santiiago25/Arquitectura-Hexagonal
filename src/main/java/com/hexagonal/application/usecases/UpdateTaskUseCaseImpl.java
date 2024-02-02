package com.hexagonal.application.usecases;

import com.hexagonal.domain.model.Task;
import com.hexagonal.domain.ports.in.UpdateTaskUseCase;
import com.hexagonal.domain.ports.out.TaskDaoPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    @Autowired
    private TaskDaoPort taskDaoPort;

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskDaoPort.update(updateTask);
    }
}
