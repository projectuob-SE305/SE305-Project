package business;
import data.User;

import data.UserRepository;

/**
 * Business Layer responsible for user account operations.
 */
public class UserService {

    private final UserRepository repository;

    public UserService() {
        repository = new UserRepository();
    }

    // Register new user
    public void register(String name, String email, String password) {

        if (!email.contains("@")) {
            System.out.println("Invalid email format.");
            return;
        }

        User existingUser = repository.findUserByEmail(email);

        if (existingUser != null) {
            System.out.println("User already exists.");
            return;
        }

        User newUser = new User(name, email, password);
        repository.addUser(newUser);
    }

    // Login verification
    public boolean login(String email, String password) {

        User user = repository.findUserByEmail(email);

        if (user == null) {
            return false;
        }

        return user.getPassword().equals(password);
    }

}