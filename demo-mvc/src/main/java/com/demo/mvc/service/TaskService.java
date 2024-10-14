package com.demo.mvc.service;

import java.util.List;

import com.demo.mvc.model.Task;

public interface TaskService {
	
    List<Task> findAll();
    
    Task findById(Long id);
    
    Task save(Task task);
    
    void deleteById(Long id);
    
}

