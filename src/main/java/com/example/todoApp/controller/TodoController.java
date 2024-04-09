package com.example.todoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.todoApp.entities.Todo;
import com.example.todoApp.services.TodoServices;

@Controller
public class TodoController {
	
	@Autowired
	private TodoServices todoServices;
	
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("todos" , this.todoServices.getAllTodos());
		return "todos";
	}
	
	@GetMapping("/todo/new")
	
	public String addTaskForm() {
		
		return "createtodo";
		
	}
	
	
	@PostMapping("/todo")
	public String addTask(@ModelAttribute("todo") Todo todo) {
		
		todo.setAction("incomplete");
		
		this.todoServices.addTask(todo);
		
		return "redirect:/home";
		
	}
	
	@GetMapping("/todo/delete/{id}")
	public String deleteTask(@PathVariable Long id) {
		
		this.todoServices.deleteTaskById(id);
		
		return "redirect:/home";
		
		
		
	}
	
	@GetMapping("/todo/edit/{id}")
	public String updateAction(@PathVariable Long id) {
		
		
		this.todoServices.upateAction(id);
		
		return "redirect:/home";
		
		
		
	}

}
