package Business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import Data.OrderRepository;

@DisplayName("OrderService Test Suite")
public class OrderServiceTest {

    private OrderService orderService;
    private OrderRepository mockRepository;

    @BeforeEach
    public void setUp() {
        mockRepository = mock(OrderRepository.class);
        orderService = new OrderService(mockRepository);
    }

    @Test
    @DisplayName("Test successful order processing with valid payment")
    public void testProcessOrderSuccess() {
        double amount = 100.50;
        String paymentMethod = "Credit Card";
        
        boolean result = orderService.processOrder(amount, paymentMethod);
        
        assertTrue(result);
        verify(mockRepository, times(1)).saveOrder(anyString());
    }

    @Test
    @DisplayName("Test order processing fails with zero amount")
    public void testProcessOrderFailsWithZeroAmount() {
        double amount = 0.0;
        String paymentMethod = "Credit Card";
        
        boolean result = orderService.processOrder(amount, paymentMethod);
        
        assertFalse(result);
        verify(mockRepository, never()).saveOrder(anyString());
    }

    @Test
    @DisplayName("Test order processing fails with negative amount")
    public void testProcessOrderFailsWithNegativeAmount() {
        double amount = -50.0;
        String paymentMethod = "PayPal";
        
        boolean result = orderService.processOrder(amount, paymentMethod);
        
        assertFalse(result);
        verify(mockRepository, never()).saveOrder(anyString());
    }

    @Test
    @DisplayName("Test order processing fails with null payment method")
    public void testProcessOrderFailsWithNullPaymentMethod() {
        double amount = 100.0;
        String paymentMethod = null;
        
        boolean result = orderService.processOrder(amount, paymentMethod);
        
        assertFalse(result);
        verify(mockRepository, never()).saveOrder(anyString());
    }

    @Test
    @DisplayName("Test order processing fails with empty payment method")
    public void testProcessOrderFailsWithEmptyPaymentMethod() {
        double amount = 100.0;
        String paymentMethod = "";
        
        boolean result = orderService.processOrder(amount, paymentMethod);
        
        assertFalse(result);
        verify(mockRepository, never()).saveOrder(anyString());
    }

    @Test
    @DisplayName("Test order processing fails with whitespace-only payment method")
    public void testProcessOrderFailsWithWhitespacePaymentMethod() {
        double amount = 100.0;
        String paymentMethod = "   ";
        
        boolean result = orderService.processOrder(amount, paymentMethod);
        
        assertFalse(result);
        verify(mockRepository, never()).saveOrder(anyString());
    }

    @Test
    @DisplayName("Test order processing with different payment methods")
    public void testProcessOrderWithDifferentPaymentMethods() {
        String[] paymentMethods = {"Credit Card", "Debit Card", "PayPal", "Bank Transfer"};
        
        for (String method : paymentMethods) {
            boolean result = orderService.processOrder(50.0, method);
            assertTrue(result, "Payment method " + method + " should succeed");
        }
        
        verify(mockRepository, times(4)).saveOrder(anyString());
    }

    @Test
    @DisplayName("Test order processing with very small positive amount")
    public void testProcessOrderWithSmallAmount() {
        double amount = 0.01;
        String paymentMethod = "Credit Card";
        
        boolean result = orderService.processOrder(amount, paymentMethod);
        
        assertTrue(result);
        verify(mockRepository, times(1)).saveOrder(anyString());
    }

    @Test
    @DisplayName("Test order processing with large amount")
    public void testProcessOrderWithLargeAmount() {
        double amount = 999999.99;
        String paymentMethod = "Credit Card";
        
        boolean result = orderService.processOrder(amount, paymentMethod);
        
        assertTrue(result);
        verify(mockRepository, times(1)).saveOrder(anyString());
    }

    @Test
    @DisplayName("Test order information format saved to repository")
    public void testOrderInformationFormat() {
        double amount = 123.45;
        String paymentMethod = "PayPal";
        
        orderService.processOrder(amount, paymentMethod);
        
        verify(mockRepository).saveOrder(argThat(orderInfo -> 
            orderInfo.contains("Amount: 123.45") &&
            orderInfo.contains("Payment Method: PayPal") &&
            orderInfo.contains("Status: COMPLETED")
        ));
    }
}
