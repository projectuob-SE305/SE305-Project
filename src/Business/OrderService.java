package Business;

import Data.OrderRepository;

/**
 * OrderService handles the business logic for order processing and payment validation.
 * This class is part of the Business Layer in the Three-Layer Architecture.
 * 
 * It validates payment details and coordinates with the Data Layer for persistence.
 * 
 * @author Abdulaziz Abdulhadi
 * @version 1.0
 */
public class OrderService {

    /**
     * Repository instance for storing processed orders.
     */
    private OrderRepository orderRepository;

    /**
     * Constructs a new OrderService with the specified OrderRepository.
     *
     * @param orderRepository The repository to use for storing orders.
     */
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Processes an order by validating the payment and storing it if valid.
     * 
     * This method performs the following steps:
     * 1. Validates that the payment amount is positive and non-zero.
     * 2. Simulates a payment gateway transaction.
     * 3. Stores the order in the repository if payment is successful.
     *
     * @param amount        The payment amount for the order.
     * @param paymentMethod The payment method used (e.g., "Credit Card", "PayPal").
     * @return true if the order was processed successfully, false otherwise.
     */
    public boolean processOrder(double amount, String paymentMethod) {
        // Step 1: Validate payment amount
        if (!validatePayment(amount)) {
            System.out.println("[Business Layer] Payment validation failed: Amount must be positive and non-zero.");
            return false;
        }

        // Step 2: Validate payment method
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            System.out.println("[Business Layer] Payment validation failed: Payment method cannot be empty.");
            return false;
        }

        // Step 3: Simulate payment gateway transaction
        boolean paymentSuccess = simulatePaymentGateway(amount, paymentMethod);
        
        if (!paymentSuccess) {
            System.out.println("[Business Layer] Payment gateway transaction failed.");
            return false;
        }

        // Step 4: Store the order in the repository
        String orderInfo = String.format("Amount: %.2f, Payment Method: %s, Status: COMPLETED", 
                                          amount, paymentMethod);
        orderRepository.saveOrder(orderInfo);
        
        System.out.println("[Business Layer] Order processed successfully.");
        return true;
    }

    /**
     * Validates that the payment amount is positive and non-zero.
     *
     * @param amount The payment amount to validate.
     * @return true if the amount is valid (positive and non-zero), false otherwise.
     */
    private boolean validatePayment(double amount) {
        return amount > 0;
    }

    /**
     * Simulates a payment gateway transaction.
     * In a real system, this would connect to an external payment processor.
     *
     * @param amount        The payment amount.
     * @param paymentMethod The payment method used.
     * @return true if the simulated transaction is successful, false otherwise.
     */
    private boolean simulatePaymentGateway(double amount, String paymentMethod) {
        System.out.println("[Business Layer] Simulating payment gateway transaction...");
        System.out.println("[Business Layer] Processing " + paymentMethod + " payment of $" + 
                           String.format("%.2f", amount));
        
        // Simulate processing delay (in a real system)
        // For simulation purposes, we assume all valid payments succeed
        System.out.println("[Business Layer] Payment gateway response: APPROVED");
        return true;
    }
}
