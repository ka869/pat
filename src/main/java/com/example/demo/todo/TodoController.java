package com.example.demo.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TodoController {

    /*
	 * Task 1: Return list of items with 200 Ok Http status
	 * Task 1.1: Add a request param that can be optionally provided to search todo items containing the string
	 */
	@GetMapping("/items")
    public ResponseEntity<List<Todo>> getAllTodos() {
		// code
    }

	/*
	 * Task 2: Return an item by id with 200 Ok Http status if found, else 404 not found
	 */
    @GetMapping("/items/{id}")
    public ResponseEntity<Todo> getTodoById() {
        // code
    }

	// Task 3: Add POST mapping to create an item and return the item created with 201 Http status
	public ResponseEntity<Todo> createTodo() {
		// code
	}

	// Task 4: Add DELETE mapping to delete an item and return 204 no content http status
	@DeleteMapping("/tutorials/{id}")
	public ResponseEntity<HttpStatus> deleteTodo(@PathVariable("id") Long id) {
		// code
	}
}
