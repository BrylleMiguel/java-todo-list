package com.todo.list.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.list.model.Todo;
import com.todo.list.repository.TodoListRepository;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private TodoListRepository todoListRepository;

    @ModelAttribute
    public Todo todo() {
        return Todo.builder().build();
    }

    @GetMapping
    public String renderHome() {
        return "home";
    }

    @ModelAttribute
    public void renderTodoList(Model m) {
        var todoList = todoListRepository.findAll();
        m.addAttribute("todo_list", todoList);
        log.info("todo list converted", todoList);
    }
}
