package presentation;

import java.util.Scanner;
import business.UserService;

/**
 * Presentation Layer
 * This class handles the interaction between the system and the user.
 * It displays the menu, receives user input, and sends requests
 * to the Business Layer (UserService).
 */
public class UserUI {

    public static void main(String[] args) {

        // Scanner object used to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Creating an instance of the business layer service
        UserService service = new UserService();

        // Infinite loop to keep the program running until the user exits
        while (true) {

            // Display menu options to the user
            System.out.println("\n===== User Account Menu =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            // Ask the user to choose an option
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline

            // Option 1: Register a new user
            if (choice == 1) {

                // Collect user information
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter email: ");
                String email = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                // Send the data to the business layer to create a new account
                service.register(name, email, password);

                System.out.println("User registered successfully.");

                // Option 2: Login
            } else if (choice == 2) {


                System.out.print("Enter email: ");
                String email = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                // Call the login method from the business layer
                boolean result = service.login(email, password);

                // Display login result to the user
                if (result) {
                    System.out.println("Login successful.");
                } else {
                    System.out.println("Invalid email or password.");
                }

                // Option 3: Exit the program
            } else if (choice == 3) {
                System.out.println("Goodbye.");
                break;
            }
        }
    }
}