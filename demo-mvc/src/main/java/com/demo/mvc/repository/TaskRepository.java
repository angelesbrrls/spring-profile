package com.demo.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.mvc.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
