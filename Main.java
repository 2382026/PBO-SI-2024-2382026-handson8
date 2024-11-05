import repositories.TodoListRepositoryImpl;
import repositories.TodoListRespository;
import services.TodoListServices;
import services.TodoListServicesImpl;
import views.TodoListTerminalView;
import views.TodoListViews;

public class Main {
    public static void main(String[] args) {
        TodoListRespository todoListRespository = new TodoListRepositoryImpl();
        TodoListServices todoListServices = new TodoListServicesImpl(todoListRespository);
        TodoListViews todoListViews = new TodoListTerminalView(todoListServices);
        todoListViews.run();
    }
}
