export class Todo {
    id: string;
    text: string;
    completed: boolean;

    constructor(text: string){
        this.text = text;
        this.completed = false;
    }
}