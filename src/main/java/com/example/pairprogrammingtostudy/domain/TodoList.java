package com.example.pairprogrammingtostudy.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class TodoList {

    @Id @GeneratedValue
    @Column(name = "TODO_ID")
    private Long id;

    @ManyToOne
    private User user;

    private String content;

}
