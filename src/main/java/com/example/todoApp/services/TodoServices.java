package com.example.todoApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoApp.entities.Todo;
import com.example.todoApp.todoRepository.TodoRepository;

@Service
public class TodoServices {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public List<Todo> getAllTodos() {
		return (List<Todo>) this.todoRepository.findAll();
	}


	public void addTask(Todo todo) {
		
		this.todoRepository.save(todo);
		
	}


	public void deleteTaskById(Long id) {
		
		this.todoRepository.deleteById(id);
		
	}


	public void upateAction(Long id) {
		
		Todo existingTodo = this.todoRepository.findById(id).get();
		existingTodo.setAction("Completed");
		this.todoRepository.save(existingTodo);
		
	}

}
