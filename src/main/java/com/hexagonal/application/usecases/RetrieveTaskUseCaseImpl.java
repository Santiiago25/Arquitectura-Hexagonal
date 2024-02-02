package com.hexagonal.application.usecases;

import com.hexagonal.domain.model.Task;
import com.hexagonal.domain.ports.in.RetrieveTaskUseCase;
import com.hexagonal.domain.ports.out.TaskDaoPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {

    @Autowired
    private TaskDaoPort taskDaoPort;

    @Override
    public Optional<Task> getTask(Long id) {
        return taskDaoPort.findById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskDaoPort.findAll();
    }
}
