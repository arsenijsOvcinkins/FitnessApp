import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserListApplicationTest {

    private Registration registration;
    private UserListApplication userListApplication;


    @BeforeEach
    void setUp() {

        List userList = new ArrayList<>();
        registration = new Registration(userList);
    }


    @Test
    void shouldDeleteUser() {
        UserListApplication.UserInput userInput = new UserListApplication.UserInput();
        userInput.username = "John";
        userInput.password = "password123";
        userListApplication.deleteUser(userList);
        assertEquals(1, registration.getUserList().size());
    }
}