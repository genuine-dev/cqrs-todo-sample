package sample.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.model.TodoId;

@RestController
public class TodoController {

	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/api/todo", method=RequestMethod.POST)
	public TodoId createTodo(@RequestBody String text){
		TodoId id = new TodoId();

		//TODO: TODO作成コマンド発行
		
		return id;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/api/todo/{todoId}", method=RequestMethod.PUT)
	public TodoId completeTodo(@PathVariable("todoId") String todoId){
		TodoId id = new TodoId(todoId);
		
		//TODO: TODO完了コマンド発行
		
		return id;
	}

}
