import { Component, Input } from '@angular/core';

import { Todo } from '../../model/todo';
import { TodoService } from '../../service/todo/todo.service'

@Component({
  selector: 'todo-item',
  templateUrl: './todo-item.component.html',
  styleUrls: ['./todo-item.component.css']
})
export class TodoItemComponent{
  @Input() private todo: Todo;

  constructor(private todoService: TodoService) { }

  onChange(){
    this.todoService.markCompleted(this.todo.id, this.todo.completed);
  }
}
