package Presentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import Business.OrderService;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@DisplayName("OrderView Test Suite")
public class OrderViewTest {

    private OrderView orderView;
    private OrderService mockOrderService;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        mockOrderService = mock(OrderService.class);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Test successful order capture with Credit Card")
    public void testCaptureOrderDetailsSuccessWithCreditCard() {
        String input = "100.50\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        when(mockOrderService.processOrder(100.50, "Credit Card")).thenReturn(true);
        
        orderView = new OrderView(mockOrderService);
        orderView.captureOrderDetails();
        
        verify(mockOrderService, times(1)).processOrder(100.50, "Credit Card");
        assertTrue(outputStreamCaptor.toString().contains("ORDER SUCCESSFUL!"));
    }

    @Test
    @DisplayName("Test successful order capture with PayPal")
    public void testCaptureOrderDetailsSuccessWithPayPal() {
        String input = "75.00\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        when(mockOrderService.processOrder(75.00, "PayPal")).thenReturn(true);
        
        orderView = new OrderView(mockOrderService);
        orderView.captureOrderDetails();
        
        verify(mockOrderService, times(1)).processOrder(75.00, "PayPal");
        assertTrue(outputStreamCaptor.toString().contains("ORDER SUCCESSFUL!"));
    }

    @Test
    @DisplayName("Test order capture with Debit Card")
    public void testCaptureOrderDetailsWithDebitCard() {
        String input = "50.00\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        when(mockOrderService.processOrder(50.00, "Debit Card")).thenReturn(true);
        
        orderView = new OrderView(mockOrderService);
        orderView.captureOrderDetails();
        
        verify(mockOrderService, times(1)).processOrder(50.00, "Debit Card");
    }

    @Test
    @DisplayName("Test order capture with Bank Transfer")
    public void testCaptureOrderDetailsWithBankTransfer() {
        String input = "200.00\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        when(mockOrderService.processOrder(200.00, "Bank Transfer")).thenReturn(true);
        
        orderView = new OrderView(mockOrderService);
        orderView.captureOrderDetails();
        
        verify(mockOrderService, times(1)).processOrder(200.00, "Bank Transfer");
    }

    @Test
    @DisplayName("Test order capture fails with invalid amount format")
    public void testCaptureOrderDetailsWithInvalidAmount() {
        String input = "invalid\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        orderView = new OrderView(mockOrderService);
        orderView.captureOrderDetails();
        
        verify(mockOrderService, never()).processOrder(anyDouble(), anyString());
        assertTrue(outputStreamCaptor.toString().contains("ERROR"));
        assertTrue(outputStreamCaptor.toString().contains("Invalid amount format"));
    }

    @Test
    @DisplayName("Test order capture fails with invalid payment method selection")
    public void testCaptureOrderDetailsWithInvalidPaymentMethod() {
        String input = "100.00\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        orderView = new OrderView(mockOrderService);
        orderView.captureOrderDetails();
        
        verify(mockOrderService, never()).processOrder(anyDouble(), anyString());
        assertTrue(outputStreamCaptor.toString().contains("ERROR"));
        assertTrue(outputStreamCaptor.toString().contains("Invalid payment method"));
    }

    @Test
    @DisplayName("Test order processing failure displays error message")
    public void testCaptureOrderDetailsProcessingFailure() {
        String input = "100.00\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        when(mockOrderService.processOrder(100.00, "Credit Card")).thenReturn(false);
        
        orderView = new OrderView(mockOrderService);
        orderView.captureOrderDetails();
        
        verify(mockOrderService, times(1)).processOrder(100.00, "Credit Card");
        assertTrue(outputStreamCaptor.toString().contains("ERROR"));
        assertTrue(outputStreamCaptor.toString().contains("Order processing failed"));
    }

    @Test
    @DisplayName("Test welcome message is displayed")
    public void testWelcomeMessageDisplayed() {
        String input = "100.00\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        when(mockOrderService.processOrder(anyDouble(), anyString())).thenReturn(true);
        
        orderView = new OrderView(mockOrderService);
        orderView.captureOrderDetails();
        
        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("Online Shopping - Order Processing"));
        assertTrue(output.contains("Payment Module"));
    }

    @Test
    @DisplayName("Test success message displays correct amount and payment method")
    public void testSuccessMessageDisplaysCorrectDetails() {
        String input = "123.45\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        when(mockOrderService.processOrder(123.45, "PayPal")).thenReturn(true);
        
        orderView = new OrderView(mockOrderService);
        orderView.captureOrderDetails();
        
        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("$123.45"));
        assertTrue(output.contains("PayPal"));
        assertTrue(output.contains("COMPLETED"));
    }
}
