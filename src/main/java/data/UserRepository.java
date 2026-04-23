package data;

import java.util.ArrayList;

/**
 * Data layer responsible for storing and retrieving users.
 */
public class UserRepository {

    private ArrayList<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    // Add new user
    public void addUser(User user) {
        users.add(user);
    }

    // Find user by email
    public User findUserByEmail(String email) {

        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }

        return null;
    }
}