package com.example.demo.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * Task: Setup base JPA repository to link the Todo entity
 */

@Repository
public interface TodoRepository  extends JpaRepository<Todo, Long>{
List<Todo>  findByItemContaingIgnoreCase(String item);
    
    
}
