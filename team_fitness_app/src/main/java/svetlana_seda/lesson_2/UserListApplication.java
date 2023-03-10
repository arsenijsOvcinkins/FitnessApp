package svetlana_seda.lesson_2;

import console_ui.*;
import database.Database;
import database.InMemoryDatabaseImpl;
import database.User;
import svetlana_seda.lesson_2.services.AddUserService;
import svetlana_seda.lesson_2.services.GetAllUsersService;
import svetlana_seda.lesson_2.services.RemoveUserService;

import java.util.Scanner;



public class UserListApplication {

    private static Database database = new InMemoryDatabaseImpl();

    private static AddUserService addUserService = new AddUserService(database);
    private static RemoveUserService removeUserService = new RemoveUserService(database);
    private static GetAllUsersService getAllUsersService = new GetAllUsersService(database);

    private static UIAction addUserUIAction = new AddUserUIAction(addUserService);
    private static UIAction removeUserUIAction = new RemoveUserUIAction(removeUserService);
    private static UIAction validateUserUIAction = new ValidateUserUIAction(getAllUsersService);
    private static UIAction exitUIAction = new ExitUIAction();



    public static void main(String[] args) {

        while (true) {
            printProgramMenu();
            int menuNumber = getMenuNumberFromUser();
            executeSelectedMenuItem(menuNumber);
        }
    }

    private static void printProgramMenu() {
        System.out.println();
        System.out.println("Program menu:");
        System.out.println("1. Register new user.");
        System.out.println("2. Login.");
        System.out.println("3. Delete user from database.");
        System.out.println("4. Exit");
        System.out.println();
    }

    private static int getMenuNumberFromUser() {
        System.out.println("Enter menu item number to execute:");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private static void executeSelectedMenuItem(int selectedMenu) {

        switch (selectedMenu) {
            case 1 -> addUserUIAction.execute();
            case 2 -> validateUserUIAction.execute();
            case 3 -> removeUserUIAction.execute();
            case 4 -> exitUIAction.execute();
        }
    }
}
