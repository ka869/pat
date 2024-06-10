package com.example.demo.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    // Task 1: Return items list if filterText param is not provided
    // Task 2: Use Stream API to filter the items which contain filterText
    // Task 3: Throw an exception if allItems is empty
    // Task 4: Use Stream API to add timetamp to each item
    public List<Todo> getAllItems(String filterText) {      
        final var allItems = todoRepository.findAll();
        List<Todo> items = new ArrayList<Todo>();

        return items;
    }

    public Optional<Todo> getItemById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo createItem(String text) {
        Todo item = todoRepository.saveAndFlush(Todo.builder().item(text).build());
        return item;
    }

    public void deleteItem(Long id) {
        todoRepository.deleteById(id);
    }
}
