package repositories;

import Entities.TodoList;

public interface TodoListRespository {
    TodoList[] getAll();
    void add(TodoList todoList);
    Boolean remove(Integer id);
    Boolean edit(TodoList todoList);
}
