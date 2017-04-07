package sample.query;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, UUID> {

}
