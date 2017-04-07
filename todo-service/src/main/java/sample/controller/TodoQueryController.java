package sample.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.query.TodoItem;
import sample.query.TodoItemRepository;

@RestController
public class TodoQueryController {
	
	@Autowired
	TodoItemRepository repository;
	
	@RequestMapping(value = "/api/todo", method = RequestMethod.GET)
	public Iterable<TodoItem> list(){
		return repository.findAll();
	}
	
	@RequestMapping(value = "/api/todo/{id}", method = RequestMethod.GET)
	public TodoItem getTodoItem(@PathVariable("id") String id){
		return repository.findOne(UUID.fromString(id));
	}
}
