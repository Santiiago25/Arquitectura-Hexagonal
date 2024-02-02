package com.hexagonal.infrastructure.dao;

import com.hexagonal.infrastructure.entities.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskDao extends CrudRepository<TaskEntity, Long> {
}
