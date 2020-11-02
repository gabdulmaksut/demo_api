package com.example.demo.todo

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class TodoService(@Autowired var todoRepository: TodoRepository) {
    fun save(todo: Todo): Unit {
        todoRepository.save(todo)
    }
}