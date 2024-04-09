package com.example.todoApp.todoRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.todoApp.entities.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
