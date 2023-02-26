package com.todo.list.repository;

import org.springframework.data.repository.CrudRepository;

import com.todo.list.model.Todo;

public interface TodoListRepository extends CrudRepository<Todo, Double> {
}
