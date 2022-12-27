package com.example.pairprogrammingtostudy.service;

import com.example.pairprogrammingtostudy.domain.TodoList;
import com.example.pairprogrammingtostudy.repository.TodoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class TodoListService {

    private final TodoListRepository todoListRepository;

    @Transactional(readOnly = false)
    public Long insertTodoList(TodoList todoList) {
        todoListRepository.Save(todoList);
        return todoList.getId();
    }


}
