package sample.eventlistener;

import org.axonframework.eventhandling.annotation.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.model.event.TodoItemCompletedEvent;
import sample.model.event.TodoItemCreatedEvent;
import sample.query.TodoItem;
import sample.query.TodoItemRepository;
@Component
public class ToDoEventListener {
	
	@Autowired
	TodoItemRepository todoItemRepository;
	
    @EventHandler
    public void handle(TodoItemCreatedEvent event) {
    	todoItemRepository.save(new TodoItem(event.getTodoId(),event.getText(),false));
        //参照用DBの更新
    }

    @EventHandler
    public void handle(TodoItemCompletedEvent event) {
    	todoItemRepository.save(new TodoItem(event.getTodoId(),"",true));
        //参照用DBの更新
    }
}
