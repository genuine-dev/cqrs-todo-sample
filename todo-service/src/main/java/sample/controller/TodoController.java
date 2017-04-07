package sample.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.model.TodoId;

@RestController
public class TodoController {

	@RequestMapping(value="/api/todo", method=RequestMethod.POST)
	public TodoId createTodo(String text){
		TodoId id = new TodoId();

		//TODO: TODO作成コマンド発行
		
		return id;
	}
	
	@RequestMapping(value="/api/todo/{todoId}", method=RequestMethod.PUT)
	public TodoId completeTodo(@PathVariable("todoId") String todoId){
		TodoId id = new TodoId(todoId);
		
		//TODO: TODO完了コマンド発行
		
		return id;
	}

}
