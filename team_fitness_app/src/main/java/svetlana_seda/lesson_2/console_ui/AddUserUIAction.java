package svetlana_seda.lesson_2.console_ui;

import svetlana_seda.lesson_2.database.Database;
import svetlana_seda.lesson_2.User;

import java.util.Scanner;

public class AddUserUIAction implements UIAction {
    private Database database;

    public AddUserUIAction(Database database) {
        this.database = database;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        User user = new User(username, password);
        database.registerNewUser(user);
        System.out.println("database.User registered with user ID " + user.getId());
    }
}
