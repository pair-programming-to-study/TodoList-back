package com.example.pairprogrammingtostudy.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@EntityListeners(value = {AuditingEntityListener.class})
public class TodoList {

    @Id @GeneratedValue
    @Column(name = "TODO_ID")
    private Long id;

    private String content;

    @CreatedDate
    private LocalDateTime dateTime;

}
