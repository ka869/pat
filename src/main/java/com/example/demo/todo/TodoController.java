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

	 private final TodoService  todoService;
	@GetMapping("/items")
    public ResponseEntity<List<Todo>> getAllTodos( @RequestParam(name= "item, required= false") String text) {
		// code

   return ResponseEntirt.ok(todoService.getAllItems(text));
		
    }

	/*
	 * Task 2: Return an item by id with 200 Ok Http status if found, else 404 not found
	 */
    @GetMapping("/items/{id}")
    public ResponseEntity<Todo> getTodoById(hVariable("id") Long id)) {
        // code
  return   todoSerice.getItemById(id).map(ResponseEntiry::ok).orElseGet(()-> ResponseEntity.notFound.build());
		
    }

	// Task 3: Add POST mapping to create an item and return the item created with 201 Http status
	public ResponseEntity<Todo> createTodo( @RequestBody Todo todo) {
		// code

	Todo createTodo= 	todoService.CreateItem(todo);


		return ResposneEntity.status(HttpState.CREATED).body(createTodo);

		
	}

	// Task 4: Add DELETE mapping to delete an item and return 204 no content http status
	@DeleteMapping("/tutorials/{id}")
	public ResponseEntity<HttpStatus> deleteTodo(@PathVariable("id") Long id) {
		// code



boolean deleted= 	todoService.deleteItem(id);

		if(!delete){


			return REsponseEntiry.notFound.build();

		}
		return ResponseEntiry.noContent().build();
	}
}
