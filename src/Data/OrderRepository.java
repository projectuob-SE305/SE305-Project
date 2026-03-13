package Data;

import java.util.ArrayList;
import java.util.List;

/**
 * OrderRepository handles data storage and persistence simulation for orders.
 * This class is part of the Data Layer in the Three-Layer Architecture.
 * 
 * @author Abdulaziz Abdulhadi
 * @version 1.0
 */
public class OrderRepository {

    /**
     * In-memory storage for processed orders.
     */
    private List<String> orders;

    /**
     * Constructs a new OrderRepository with an empty order list.
     */
    public OrderRepository() {
        this.orders = new ArrayList<>();
    }

    /**
     * Saves an order to the repository.
     * This method simulates persisting order information to a data store.
     *
     * @param info The order information string to be saved.
     */
    public void saveOrder(String info) {
        orders.add(info);
        System.out.println("[Data Layer] Order saved successfully: " + info);
    }

    /**
     * Retrieves all stored orders.
     *
     * @return A list of all order information strings.
     */
    public List<String> getAllOrders() {
        return new ArrayList<>(orders);
    }

    /**
     * Gets the total number of orders stored.
     *
     * @return The count of orders in the repository.
     */
    public int getOrderCount() {
        return orders.size();
    }
}
