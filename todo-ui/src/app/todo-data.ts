import { InMemoryDbService } from 'angular-in-memory-web-api';


export class TodoData implements InMemoryDbService {
    createDb() {
        let todos = [
            {id: '', text: 'test', completed: false},
            {id: '', text: 'test', completed: false},
            {id: '', text: 'test', completed: false},
        ];
        return { todos };
    }
}