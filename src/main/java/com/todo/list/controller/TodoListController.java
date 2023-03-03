package com.todo.list.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.list.model.Todo;
import com.todo.list.repository.TodoListRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("list")
public class TodoListController {

    @Autowired
    private TodoListRepository todoListRepository;

    @ModelAttribute("todo_list")
    public Iterable<Todo> todoList() {
        var list = todoListRepository.findAll();
        log.info("todo list:", list);
        return list;
    }

    @GetMapping
    public String renderList() {
        return "todolist";
    }
}
