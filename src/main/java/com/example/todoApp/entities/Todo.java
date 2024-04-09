package com.example.todoApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TodoTable")
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String description;
	private String date;
	
	private String action;
	
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(Long id, String name, String description, String date, String action) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.action = "Incomplete";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", action="
				+ action + "]";
	}
	

}
