package sample.model;

import java.util.UUID;

import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;
import org.axonframework.eventsourcing.annotation.EventSourcingHandler;

import sample.model.command.CreateTodoItemCommand;
import sample.model.command.MarkCompletedCommand;
import sample.model.event.TodoItemCompletedEvent;
import sample.model.event.TodoItemCreatedEvent;

public class TodoItem extends AbstractAnnotatedAggregateRoot<TodoId> {
    @AggregateIdentifier
    private UUID todoId;
    private String text;
    private boolean completed;

    public TodoItem() {
    }

    @CommandHandler
    public TodoItem(CreateTodoItemCommand command) {
        apply(new TodoItemCreatedEvent(command.getTodoId(), command.getText()));
    }


    @CommandHandler
    public void markCompleted(MarkCompletedCommand command) {
       apply(new TodoItemCompletedEvent(todoId));
     }

    @EventSourcingHandler
    public void on(TodoItemCreatedEvent event) {
        this.todoId = event.getTodoId();
        this.text = event.getText();
    }

    @EventSourcingHandler
    public void on(TodoItemCompletedEvent event) {
        this.completed = true;
    }
}
