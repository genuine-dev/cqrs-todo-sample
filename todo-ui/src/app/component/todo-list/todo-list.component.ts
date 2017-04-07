import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';

import { TodoService } from '../../service/todo/todo.service';
import { Todo } from '../../model/todo';

@Component({
  selector: 'todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {
  private todos: Observable<Todo[]>

  constructor(private todoService: TodoService) 
  { }

  ngOnInit() {
    this.todoService.listAll();
    this.todos = this.todoService.todos;
  }

}
