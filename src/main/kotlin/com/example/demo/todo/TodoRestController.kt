package com.example.demo.todo
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/v1/api/tasks")
class TodoRestController(val todoRepository: TodoRepository) {
    @GetMapping
    fun getTodos() = todoRepository.findAll()

    @RequestMapping(path = [("/{todoId}")], method = [(RequestMethod.GET)])
    fun getTodo(@PathVariable("todoId") todoId: Long?): Optional<Todo>? {
        return todoId?.let { todoRepository.findById(it) }
    }
}