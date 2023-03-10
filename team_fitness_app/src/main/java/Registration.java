import java.util.ArrayList;
import java.util.List;

public class Registration {

    private List<User> userList;

    public Registration(List userList) {
        this.userList = userList;
    }

    public void registerUser(String username, String password) {
        if (isUsernameAvailable(username)) {
            User user = new User(username, password);
            userList.add(user);
            System.out.println("User with username " + username + " registered successfully!");
        } else {
            System.out.println("Username " + username + " is already taken!");
        }
    }

    public boolean isUsernameAvailable(String username) {
        for (User user : userList)
            if (user.getUsername().equals(username))
                return false;  // username is already taken

        return true;  // username is available
    }

    public List<User> getUserList() {
        return userList;
    }
}