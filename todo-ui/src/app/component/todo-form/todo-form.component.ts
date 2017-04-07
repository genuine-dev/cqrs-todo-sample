import { Component } from '@angular/core';
import { TodoService } from '../../service/todo/todo.service'

@Component({
  selector: 'todo-form',
  templateUrl: './todo-form.component.html',
  styleUrls: ['./todo-form.component.css']
})
export class TodoFormComponent　{
  private todoText = '';

  constructor(private todoService: TodoService) { }

  onSubmit(){
    this.todoService.addTodo(this.todoText);
  }

}
