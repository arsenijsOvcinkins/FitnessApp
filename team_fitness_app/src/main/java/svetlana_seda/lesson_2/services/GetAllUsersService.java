package svetlana_seda.lesson_2.services;

import svetlana_seda.lesson_2.User;
import svetlana_seda.lesson_2.database.Database;

import java.util.List;

public class GetAllUsersService {

    private Database database;

    public GetAllUsersService(Database database) {
        this.database = database;
    }

    public List<User> execute() {
        return database.getUsers();
    }

}
