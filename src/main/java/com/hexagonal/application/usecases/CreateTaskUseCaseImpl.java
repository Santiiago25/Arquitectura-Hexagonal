package com.hexagonal.application.usecases;

import com.hexagonal.domain.model.Task;
import com.hexagonal.domain.ports.in.CreateTaskUseCase;
import com.hexagonal.domain.ports.out.TaskDaoPort;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
    @Autowired
    private TaskDaoPort taskDaoPort;

    @Override
    public Task createTask(Task task) {
        return taskDaoPort.save(task);
    }
}
