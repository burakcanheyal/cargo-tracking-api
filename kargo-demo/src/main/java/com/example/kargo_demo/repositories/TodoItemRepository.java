package com.example.kargo_demo.repositories;

import com.example.kargo_demo.models.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<ToDoItem, Long> {

}
