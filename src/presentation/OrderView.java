package presentation;

import java.util.Scanner;
import business.OrderService;
import data.OrderRepository;

/**
 * OrderView is the entry point for the Order Processing & Payment Module.
 * This class is part of the Presentation Layer in the Three-Layer Architecture.
 * 
 * It handles user input/output through the console and coordinates with
 * the Business Layer for order processing.
 * 
 * @author Abdulaziz Abdulhadi
 * @version 1.0
 */
public class OrderView {

    /**
     * Scanner instance for reading user input from the console.
     */
    private Scanner scanner;

    /**
     * Service instance for processing orders.
     */
    private OrderService orderService;

    /**
     * Constructs a new OrderView with the specified OrderService.
     *
     * @param orderService The service to use for processing orders.
     */
    public OrderView(OrderService orderService) {
        this.scanner = new Scanner(System.in);
        this.orderService = orderService;
    }

    /**
     * Displays the welcome message and menu header.
     */
    private void displayWelcome() {
        System.out.println("========================================");
        System.out.println("   Online Shopping - Order Processing   ");
        System.out.println("        & Payment Module                ");
        System.out.println("========================================");
        System.out.println();
    }

    /**
     * Captures order details from the user including amount and payment method.
     * Validates input and displays appropriate success or error messages.
     */
    public void captureOrderDetails() {
        displayWelcome();

        try {
            // Capture payment amount
            System.out.print("Enter payment amount: $");
            String amountInput = scanner.nextLine().trim();
            double amount;
            
            try {
                amount = Double.parseDouble(amountInput);
            } catch (NumberFormatException e) {
                displayError("Invalid amount format. Please enter a valid number.");
                return;
            }

            // Capture payment method
            System.out.println();
            System.out.println("Available Payment Methods:");
            System.out.println("1. Credit Card");
            System.out.println("2. Debit Card");
            System.out.println("3. PayPal");
            System.out.println("4. Bank Transfer");
            System.out.print("Select payment method (1-4): ");
            
            String methodChoice = scanner.nextLine().trim();
            String paymentMethod = getPaymentMethod(methodChoice);
            
            if (paymentMethod == null) {
                displayError("Invalid payment method selection.");
                return;
            }

            System.out.println();
            System.out.println("Processing your order...");
            System.out.println("----------------------------------------");

            // Process the order through the Business Layer
            boolean success = orderService.processOrder(amount, paymentMethod);

            System.out.println("----------------------------------------");
            System.out.println();

            if (success) {
                displaySuccess(amount, paymentMethod);
            } else {
                displayError("Order processing failed. Please check your payment details and try again.");
            }

        } catch (Exception e) {
            displayError("An unexpected error occurred: " + e.getMessage());
        }
    }

    /**
     * Maps the user's menu selection to a payment method string.
     *
     * @param choice The user's menu selection (1-4).
     * @return The payment method string, or null if the selection is invalid.
     */
    private String getPaymentMethod(String choice) {
        switch (choice) {
            case "1":
                return "Credit Card";
            case "2":
                return "Debit Card";
            case "3":
                return "PayPal";
            case "4":
                return "Bank Transfer";
            default:
                return null;
        }
    }

    /**
     * Displays a success message after a successful order processing.
     *
     * @param amount        The payment amount.
     * @param paymentMethod The payment method used.
     */
    private void displaySuccess(double amount, String paymentMethod) {
        System.out.println("========================================");
        System.out.println("         ORDER SUCCESSFUL!              ");
        System.out.println("========================================");
        System.out.println("Amount Paid: $" + String.format("%.2f", amount));
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Status: COMPLETED");
        System.out.println("========================================");
        System.out.println("Thank you for your purchase!");
    }

    /**
     * Displays an error message to the user.
     *
     * @param message The error message to display.
     */
    private void displayError(String message) {
        System.out.println();
        System.out.println("========================================");
        System.out.println("              ERROR                     ");
        System.out.println("========================================");
        System.out.println(message);
        System.out.println("========================================");
    }

    /**
     * Closes the scanner resource.
     */
    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }

    /**
     * Main method - Entry point for the Order Processing & Payment Module.
     * Initializes the three-layer architecture components and starts the application.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Initialize Data Layer
        OrderRepository orderRepository = new OrderRepository();
        
        // Initialize Business Layer with Data Layer dependency
        OrderService orderService = new OrderService(orderRepository);
        
        // Initialize Presentation Layer with Business Layer dependency
        OrderView orderView = new OrderView(orderService);
        
        // Start the application
        orderView.captureOrderDetails();
        
        // Clean up resources
        orderView.close();
    }
}
