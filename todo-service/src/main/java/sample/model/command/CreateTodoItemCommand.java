package sample.model.command;

import java.util.UUID;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

import sample.model.TodoId;

public class CreateTodoItemCommand {
	@TargetAggregateIdentifier
	private final UUID todoId;
	private final String text;
	
	public CreateTodoItemCommand(UUID todoId, String text) {
		this.todoId = todoId;
		this.text = text;
	}
	
	public UUID getTodoId() {
		return todoId;
	}
	
	public String getText() {
		return text;
	}
	
	

}
