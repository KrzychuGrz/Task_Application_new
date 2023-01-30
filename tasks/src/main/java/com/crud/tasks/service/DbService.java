package com.crud.tasks.service;

import com.crud.tasks.TaskRepository.TaskRepository;
import com.crud.tasks.domain.Task;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DbService {

    private final TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }



}
