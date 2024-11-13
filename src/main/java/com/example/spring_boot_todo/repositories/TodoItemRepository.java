package com.example.spring_boot_todo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_boot_todo.models.TodoItem;


public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {  

}
