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

    public List<Todo> getAllItems(String filterText) throws Exception {        
        List<Todo> items = new ArrayList<Todo>();

        if (filterText == null) {
            todoRepository
                .findAll()
                .forEach(items::add);
        } else {
            todoRepository
                .findAll()
                .stream()
                .filter(s->s.getItem().contains(filterText))
                .forEach(items::add);
        }

        if (items.isEmpty()) {
            throw new Exception("not found");
        }

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
