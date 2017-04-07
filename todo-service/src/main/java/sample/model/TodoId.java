package sample.model;

import java.util.UUID;

public class TodoId {
	private UUID id;
	
	public TodoId(){
		this.id = UUID.randomUUID();
	}
	
	public TodoId(String id){
		this.id = UUID.fromString(id);
	}
	
	public UUID getId(){
		return id;
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
}
