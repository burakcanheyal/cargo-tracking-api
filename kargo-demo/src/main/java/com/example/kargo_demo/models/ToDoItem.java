package com.example.kargo_demo.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "todo_items")
public class ToDoItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;

    private Boolean isComplete;

    private Instant createdAt;

    private Instant updatedAt;


    @Override
    public String toString() {
        return String.format("TodoItem{id=%d,description='%s'," +
                "isComplete='%s',createdAt='%s',updatedAt='%s'}"
                , id, description, isComplete, createdAt, updatedAt );
    }
}
