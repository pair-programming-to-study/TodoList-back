package com.example.pairprogrammingtostudy.repository;

import com.example.pairprogrammingtostudy.domain.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoList, Long> {



}
