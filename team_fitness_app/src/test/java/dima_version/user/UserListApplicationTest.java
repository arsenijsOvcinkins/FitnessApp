package dima_version.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserListApplicationTest {


        Database database = new InMemoryDatabaseImpl();
        UserListApplication userListApplication = new UserListApplication();


    @Test
    private void registerUser() {
        User user = new User("A", "a");
        database.registerNewUser(user);
        assertEquals(1, database.getUsers().size());
    }

    @Test
    private void deleteUser() {
        User user1 = new User("A", "a");
        User user2 = new User("B", "b");
        database.registerNewUser(user1);
        database.registerNewUser(user2);
        database.deleteUser(1L, "a");
        assertEquals(1, database.getUsers().size());
    }

    private void login() {
        User user1 = new User("A", "a");
        database.registerNewUser(user1);
        assertTrue(database.login(1L, "a"));
    }
}