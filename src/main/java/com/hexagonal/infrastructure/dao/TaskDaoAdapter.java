package com.hexagonal.infrastructure.dao;

import com.hexagonal.domain.model.Task;
import com.hexagonal.domain.ports.out.TaskDaoPort;
import com.hexagonal.infrastructure.entities.TaskEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TaskDaoAdapter implements TaskDaoPort {

    @Autowired
    private TaskDao taskDao;

    @Override
    public Task save(Task task) {
        TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
        TaskEntity savedTaskEntity = taskDao.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Task> findById(Long id) {
        return taskDao.findById(id).map(TaskEntity::toDomainModel);
    }

    @Override
    public List<Task> findAll() {
        List<TaskEntity> taskEntities = (List<TaskEntity>) taskDao.findAll();
        if (taskEntities != null) {
            return taskEntities.stream()
                    .map(TaskEntity::toDomainModel)
                    .collect(Collectors.toList());
        } else {
            // Puedes manejar el caso en que taskDao.findAll() devuelva null, por ejemplo, lanzando una excepción o devolviendo una lista vacía.
            // Aquí devolveré una lista vacía como ejemplo.
            throw new IllegalStateException("La lista de TaskEntity devuelta por taskDao.findAll() es nula");
        }
        //return taskDao.findAll().stream().map(TaskEntity::toDomainModel).collect(Collectors.toList());
    }

    @Override
    public Optional<Task> update(Task task) {
        if (taskDao.existsById(task.getId())){
            TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
            TaskEntity updateTaskEntity = taskDao.save(taskEntity);
            return Optional.of(updateTaskEntity.toDomainModel());
        }

        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (taskDao.existsById(id)){
            taskDao.deleteById(id);
            return true;
        }
        return false;
    }
}
