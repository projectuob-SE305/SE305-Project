package Data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@DisplayName("OrderRepository Test Suite")
public class OrderRepositoryTest {

    private OrderRepository orderRepository;

    @BeforeEach
    public void setUp() {
        orderRepository = new OrderRepository();
    }

    @Test
    @DisplayName("Test saving a single order")
    public void testSaveOrder() {
        String orderInfo = "Amount: 100.00, Payment Method: Credit Card, Status: COMPLETED";
        orderRepository.saveOrder(orderInfo);
        
        assertEquals(1, orderRepository.getOrderCount());
        assertTrue(orderRepository.getAllOrders().contains(orderInfo));
    }

    @Test
    @DisplayName("Test saving multiple orders")
    public void testSaveMultipleOrders() {
        orderRepository.saveOrder("Order 1");
        orderRepository.saveOrder("Order 2");
        orderRepository.saveOrder("Order 3");
        
        assertEquals(3, orderRepository.getOrderCount());
    }

    @Test
    @DisplayName("Test getAllOrders returns all saved orders")
    public void testGetAllOrders() {
        String order1 = "Amount: 50.00, Payment Method: PayPal, Status: COMPLETED";
        String order2 = "Amount: 75.00, Payment Method: Credit Card, Status: COMPLETED";
        
        orderRepository.saveOrder(order1);
        orderRepository.saveOrder(order2);
        
        List<String> orders = orderRepository.getAllOrders();
        assertEquals(2, orders.size());
        assertTrue(orders.contains(order1));
        assertTrue(orders.contains(order2));
    }

    @Test
    @DisplayName("Test getOrderCount returns correct count")
    public void testGetOrderCount() {
        assertEquals(0, orderRepository.getOrderCount());
        
        orderRepository.saveOrder("Order 1");
        assertEquals(1, orderRepository.getOrderCount());
        
        orderRepository.saveOrder("Order 2");
        assertEquals(2, orderRepository.getOrderCount());
    }

    @Test
    @DisplayName("Test getAllOrders returns a copy, not the original list")
    public void testGetAllOrdersReturnsCopy() {
        orderRepository.saveOrder("Order 1");
        
        List<String> orders = orderRepository.getAllOrders();
        orders.add("Order 2");
        
        assertEquals(1, orderRepository.getOrderCount());
    }

    @Test
    @DisplayName("Test repository starts empty")
    public void testRepositoryStartsEmpty() {
        assertEquals(0, orderRepository.getOrderCount());
        assertTrue(orderRepository.getAllOrders().isEmpty());
    }
}
