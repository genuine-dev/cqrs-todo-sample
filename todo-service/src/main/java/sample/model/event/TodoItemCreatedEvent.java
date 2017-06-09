package sample.model.event;

import java.util.UUID;

public class TodoItemCreatedEvent {
	
	private final UUID todoId;
	private final String text;
	
	public TodoItemCreatedEvent(UUID todoId, String text) {
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
