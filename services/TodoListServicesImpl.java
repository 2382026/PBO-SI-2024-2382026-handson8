package services;

import Entities.TodoList;
import repositories.TodoListRespository;

public class TodoListServicesImpl implements TodoListServices{
    private  final TodoListRespository todoListRespository;

    public TodoListServicesImpl(final TodoListRespository todoListRespository) {
        this.todoListRespository = todoListRespository;
    }

    @Override
    public TodoList[] getTodoList() {
        return todoListRespository.getAll();
    }

    @Override
    public void addTodoList(final String todo) {
        if (todo.isEmpty() || todo.isBlank()) {
            System.out.println("Masukkan todo dengan benar");
            return;
        }
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoListRespository.add(todoList);
    }

    @Override
    public Boolean removeTodoList(final Integer number) {
        return todoListRespository.remove(number);
    }

    @Override
    public Boolean editTodoList(final Integer number, final String todo) {
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoList.setId(number);
        return todoListRespository.edit(todoList);
    }
}
