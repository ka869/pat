package com.example.demo.todo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
 * Task: Finish entity creation with 2 additional columns:
 *   - "item" to hold the todo text string
 *   - "timestamp" to hold the date and time value
 */
@Entity
@Table(name = "todo")
    @Getter
    @Setter
    @builder
    
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @column(nullable= false)
    private String item

    @column(nullable= false)
    private LocalDateTime= timestamp;
    

    // code
}
