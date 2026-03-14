package presentation;

import java.util.Scanner;
import business.UserService;


public class UserUI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserService service = new UserService();

        while (true) {

            System.out.println("\n===== User Account Menu =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter email: ");
                String email = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                service.register(name, email, password);

                System.out.println("User registered successfully.");

            } else if (choice == 2) {

                System.out.print("Enter email: ");
                String email = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                boolean result = service.login(email, password);

                if (result) {
                    System.out.println("Login successful.");
                } else {
                    System.out.println("Invalid email or password.");
                }

            } else if (choice == 3) {
                System.out.println("Goodbye.");
                break;
            }
        }
    }
}