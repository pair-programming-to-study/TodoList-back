package com.example.pairprogrammingtostudy.service;

import com.example.pairprogrammingtostudy.controller.TodoListForm;
import com.example.pairprogrammingtostudy.domain.TodoList;
import com.example.pairprogrammingtostudy.repository.TodoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
public class TodoListService {

    private final TodoListRepository todoListRepository;

    @Transactional
    public Long insertTodoList(TodoListForm todoListForm) {
        TodoList todoList = new TodoList();
        todoList.setContent(todoListForm.getTodo());
        todoList.setDateTime(LocalDateTime.now());
        todoListRepository.save(todoList);
        return todoList.getId();
    }


}
