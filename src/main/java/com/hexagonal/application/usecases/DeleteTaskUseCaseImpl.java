package com.hexagonal.application.usecases;

import com.hexagonal.domain.ports.in.DeleteTaskUseCase;
import com.hexagonal.domain.ports.out.TaskDaoPort;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    @Autowired
    private TaskDaoPort taskDaoPort;

    @Override
    public boolean deleteTask(Long id) {
        return taskDaoPort.deleteById(id);
    }
}
