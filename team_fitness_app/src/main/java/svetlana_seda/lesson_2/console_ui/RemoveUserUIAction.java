package svetlana_seda.lesson_2.console_ui;

import svetlana_seda.lesson_2.database.Database;
import svetlana_seda.lesson_2.services.RemoveUserService;

import java.util.Scanner;

public class RemoveUserUIAction implements UIAction {

    private  RemoveUserService removeUserService;
    private Database database;


    public RemoveUserUIAction(Database database) {
        this.database = database;
    }
    public RemoveUserUIAction(RemoveUserService removeUserService) {
        this.removeUserService = removeUserService;
    }
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user ID");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (database.deleteUser(id, password))
            System.out.println("database.User was removed from database.");
        else
            System.out.println("Id or Password is Incorrect!");
    }
}
