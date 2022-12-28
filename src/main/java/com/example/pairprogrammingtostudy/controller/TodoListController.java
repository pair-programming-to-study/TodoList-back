package com.example.pairprogrammingtostudy.controller;

import com.example.pairprogrammingtostudy.domain.TodoList;
import com.example.pairprogrammingtostudy.service.TodoListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TodoListController {

    private final TodoListService todoListService;


    @PostMapping("/todos")
    public ResponseEntity getTodoContent(@RequestBody TodoListForm todoListForm) {
        todoListService.insertTodoList(todoListForm);
        return new ResponseEntity("투두리스트 저장 성공", HttpStatus.OK);    //성공했다고 이렇게 보내주는게 좋다 원래는 dto 하나 만들고 바디에다가
                                                                            //dto 안에 메세지랑 정보를 넣어줘야 좋다 그래야 바디 객체형식으로 json 형태로 드간
    }

}
