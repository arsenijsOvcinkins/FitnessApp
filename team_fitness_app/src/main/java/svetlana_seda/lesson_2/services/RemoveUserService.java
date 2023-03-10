package svetlana_seda.lesson_2.services;

import svetlana_seda.lesson_2.database.Database;

public class RemoveUserService {
    private Database database;

    public RemoveUserService(Database database) {
        this.database = database;
    }

    public void execute(Long Id) {
        database.deleteUser(Long id, String password);
    }
}

