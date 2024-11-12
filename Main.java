import config.Database;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryDbImpl;
import repositories.TodoListRepositoryImpl;
import services.TodoListServices;
import services.TodoListServicesImpl;
import views.TodoListTerminalViews;
import views.TodoListViews;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Database database = new Database("databaseku", "root", "", "Localhost", "3306");
        database.setup();

        TodoListRepository todoListRepository = new TodoListRepositoryDbImpl(database);
        TodoListRepository todoListRepository1 = new TodoListRepositoryImpl();
        TodoListServices todoListServices = new TodoListServicesImpl(todoListRepository);
        TodoListViews todoListViews = new TodoListTerminalViews(todoListServices);
        todoListViews.run();
    }
}
