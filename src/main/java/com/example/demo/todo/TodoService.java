package com.example.demo.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


public class TodoService {

    private final TodoRepository todoRepository;
    
    // Task 1: code getAllItems()
public List<Todo> getAllItems(String text){

    List<Todo> todos;

    if(text==null || text.isBlank()){
   // in repository i will write the findall 

        todoRepository.findAll();
        
    }else{
         todos= todoRepository.findbyItemContaingIgnoreCase(text);
          
    }


    return todos;
}

    
    // throw exception if no todo items exist in table

    // Task 2: code getItemById()
public   Optional<Todo> getItemById(LongID){

    return todoRepository.findById(id);
                                    
}

    // Task 3: code createItem()


    public Todo CreateItem(Todo todo){
 return todoRepository.save(todo);
    }

    // Task 4: code deleteItem()


    public boolean deleteItem(Long id){

        if(todoRepository.existsByID(id)){

                return false;
        }

        todoRepository.deleteById(id);

        return true;

    }
}
