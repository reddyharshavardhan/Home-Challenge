package com.example.spring_boot_todo.config;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring_boot_todo.models.TodoItem;
import com.example.spring_boot_todo.repositories.TodoItemRepository;

@Component
public class TodoItemDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(TodoItemDataLoader.class);

    @Autowired
    TodoItemRepository todoItemRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData() {
        if (todoItemRepository.count() == 0) {
            TodoItem todoItem1 = new TodoItem("harshavardhan");
            TodoItem todoItem2 = new TodoItem("reddy");

            todoItemRepository.save(todoItem1);
            todoItemRepository.save(todoItem2); 
        }

        logger.info("Number of TodoItems: {}", todoItemRepository.count());
    }
    
}