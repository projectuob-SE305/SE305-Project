package Business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import Business.OrderService;
import Data.OrderRepository;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import Presentation.OrderView;

@DisplayName("OrderView Test Suite")
public class OrderServiceTest {

    private OrderService orderService;
    private OrderRepository orderRepository;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    public void setUp() {
        orderRepository = new OrderRepository();
        orderService = new OrderService(orderRepository);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    @DisplayName("Test successful order capture with Credit Card")
    public void testCaptureOrderDetailsSuccessWithCreditCard() {
        String input = "100.50\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        OrderView orderView = new OrderView(orderService);
        orderView.captureOrderDetails();

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("ORDER SUCCESSFUL!"));
        assertEquals(1, orderRepository.getOrderCount());
    }

    @Test
    @DisplayName("Test successful order capture with PayPal")
    public void testCaptureOrderDetailsSuccessWithPayPal() {
        String input = "75.00\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        OrderView orderView = new OrderView(orderService);
        orderView.captureOrderDetails();

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("ORDER SUCCESSFUL!"));
        assertEquals(1, orderRepository.getOrderCount());
    }

    @Test
    @DisplayName("Test order capture with Debit Card")
    public void testCaptureOrderDetailsWithDebitCard() {
        String input = "50.00\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        OrderView orderView = new OrderView(orderService);
        orderView.captureOrderDetails();

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("ORDER SUCCESSFUL!"));
        assertEquals(1, orderRepository.getOrderCount());
    }

    @Test
    @DisplayName("Test order capture with Bank Transfer")
    public void testCaptureOrderDetailsWithBankTransfer() {
        String input = "200.00\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        OrderView orderView = new OrderView(orderService);
        orderView.captureOrderDetails();

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("ORDER SUCCESSFUL!"));
        assertEquals(1, orderRepository.getOrderCount());
    }

    @Test
    @DisplayName("Test order capture fails with invalid amount format")
    public void testCaptureOrderDetailsWithInvalidAmount() {
        String input = "invalid\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        OrderView orderView = new OrderView(orderService);
        orderView.captureOrderDetails();

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("ERROR"));
        assertTrue(output.contains("Invalid amount format"));
        assertEquals(0, orderRepository.getOrderCount());
    }

    @Test
    @DisplayName("Test order capture fails with invalid payment method selection")
    public void testCaptureOrderDetailsWithInvalidPaymentMethod() {
        String input = "100.00\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        OrderView orderView = new OrderView(orderService);
        orderView.captureOrderDetails();

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("ERROR"));
        assertTrue(output.contains("Invalid payment method"));
        assertEquals(0, orderRepository.getOrderCount());
    }

    @Test
    @DisplayName("Test welcome message is displayed")
    public void testWelcomeMessageDisplayed() {
        String input = "100.00\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        OrderView orderView = new OrderView(orderService);
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

        OrderView orderView = new OrderView(orderService);
        orderView.captureOrderDetails();

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("$123.45"));
        assertTrue(output.contains("PayPal"));
        assertTrue(output.contains("COMPLETED"));
    }

    @Test
    @DisplayName("Test order processing with zero amount shows failure")
    public void testCaptureOrderDetailsWithZeroAmount() {
        String input = "0\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        OrderView orderView = new OrderView(orderService);
        orderView.captureOrderDetails();

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("Order processing failed"));
        assertEquals(0, orderRepository.getOrderCount());
    }
}
