package sample.model.event;

import java.util.UUID;

public class TodoItemCompletedEvent {

    private final UUID todoId;

    public TodoItemCompletedEvent(UUID todoId) {
        this.todoId = todoId;
    }

    public UUID getTodoId() {
        return todoId;
    }
}
