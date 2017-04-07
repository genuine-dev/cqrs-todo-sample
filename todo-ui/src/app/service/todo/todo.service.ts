import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

import { BehaviorSubject } from 'rxjs/BehaviorSubject';
import { Observable } from 'rxjs/Observable';

import { Todo } from '../../model/todo';

@Injectable()
export class TodoService {
  private _todos: BehaviorSubject<Todo[]> = new BehaviorSubject([])
  public todos: Observable<Todo[]> = this._todos.asObservable();
 
  constructor(
    private http: Http
  ) {}

  listAll() {
    this.http
      .get('http://localhost:8080/api/todos')
      .subscribe(response => {
        this._todos.next(Object.assign([], response.json().data));
      })
  }

  addTodo(text: string) {
    let todo = new Todo(text);
    this.http
      .post('http://localhost:8080/api/todo/', text)
      .subscribe(response => {
        let newState = Object.assign([], this._todos.getValue());
        newState.push(todo);
        this._todos.next(newState);
      });
  }

  markCompleted(id: String, completed: boolean){
    this.http
      .put(`http://localhost:8080/api/todo/${id}`, null)
      .subscribe(response =>{
        let newState = this._todos.getValue().map(todo => {
          if(todo.id === id){
            todo.completed = completed;
          }
          return todo;
        })
        this._todos.next(newState);
      })
  }
}
