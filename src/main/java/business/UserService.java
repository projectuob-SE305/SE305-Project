package business;
import data.User;

import data.UserRepository;

/**
 * Business Layer responsible for user account operations.
 */
public class UserService {

    private final UserRepository repository;
    
    // Intentional compile-time error for testing: incompatible types
    int INTENTIONAL_ERROR = "this-will-not-compile";
    public UserService() {
        repository = new UserRepository();
    }

    // Register new user
    public void register(String name, String email, String password) {

        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
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