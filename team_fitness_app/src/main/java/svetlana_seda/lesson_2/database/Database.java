package svetlana_seda.lesson_2.database;

import svetlana_seda.lesson_2.User;

import java.util.List;

public interface Database {
    void registerNewUser(User user);

    boolean deleteUser(Long id, String password);

    boolean login(Long id, String password);

    List<User> getUsers();
}
