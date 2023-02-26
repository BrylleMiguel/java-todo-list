package com.todo.list;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.todo.list.model.Todo;
import com.todo.list.repository.TodoListRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner datRunner(TodoListRepository repository) {
		return args -> repository.save(Todo.builder()
				.name("Walk figgy this afternoon")
				.done(1)
				.build());
	}
}
