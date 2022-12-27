package com.example.pairprogrammingtostudy.repository;

import com.example.pairprogrammingtostudy.domain.TodoList;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class TodoListRepository {

    private final EntityManager em;

    public void Save(TodoList todoList) {

        em.persist(todoList);

    }

}
