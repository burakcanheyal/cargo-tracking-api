package com.example.kargo_demo.services;


import com.example.kargo_demo.models.ToDoItem;
import com.example.kargo_demo.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class TodoItemService {

    @Autowired
    private TodoItemRepository todoItemRepository;

    public Iterable<ToDoItem> getAll() {
        return todoItemRepository.findAll();
    }

    public Optional<ToDoItem> getById(long id) {
        return todoItemRepository.findById(id);
    }

    public ToDoItem save(ToDoItem todoItem){
        if(todoItem.getId() == 0){
            todoItem.setCreatedAt(Instant.now());
        }
        todoItem.setUpdatedAt(Instant.now());
        return todoItemRepository.save(todoItem);
    }

    public void delete(ToDoItem todoItem){
        todoItemRepository.delete(todoItem);
    }
}
