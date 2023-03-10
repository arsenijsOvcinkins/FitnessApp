package svetlana_seda.lesson_2.services;


import svetlana_seda.lesson_2.User;
import svetlana_seda.lesson_2.database.Database;

public class AddUserService {

    private Database database;

    public AddUserService(Database database) {
        this.database = database;
    }

    public void execute(String username, String password) {
        User user = new User(username, password);
        database.registerNewUser(user);
    }

}
