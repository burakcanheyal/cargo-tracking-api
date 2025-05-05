package com.example.kargo_demo.controllers;

import com.example.kargo_demo.models.ToDoItem;
import com.example.kargo_demo.services.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoFormController {

    @Autowired
    private TodoItemService todoItemService;

    @GetMapping("/create-todo")
    public String showCreateForm() {
        return "new-todo-item";
    }
}
