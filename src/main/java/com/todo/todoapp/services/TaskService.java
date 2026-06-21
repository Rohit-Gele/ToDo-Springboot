package com.todo.todoapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.todoapp.models.Task;
import com.todo.todoapp.repository.TaskRepository;

@Service
public class TaskService {

	private final TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}
}
