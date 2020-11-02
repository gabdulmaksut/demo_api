package com.example.demo.todo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


interface TodoRepository : JpaRepository<Todo, Long>{}
