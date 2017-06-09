package sample.query;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import sample.model.TodoId;

@Entity
public class TodoItem {
	@Id
	private UUID id;
	
	private String text;
	
	private boolean completed;
	
	@SuppressWarnings("unused")
	private TodoItem(){}
	
	public TodoItem(UUID id, String text, boolean completed){
		this.id = id;
		this.text = text;
		this.completed = completed;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getText() {
		return text;
	}
	
	public boolean isCompleted(){
		return completed;
	}
}
