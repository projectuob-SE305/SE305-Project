package com.yusuf.se305.presentation;

import com.yusuf.se305.business.CartService;
import com.yusuf.se305.business.ProductService;
import com.yusuf.se305.data.InMemoryProductRepository;
import com.yusuf.se305.data.ProductRepository;
import com.yusuf.se305.model.Cart;
import com.yusuf.se305.model.CartItem;
import com.yusuf.se305.model.Product;

import java.util.List;
import java.util.Scanner;

/**
 * Console Presentation Demo
 *
 * Features:
 *  - Browse active products (simple list)
 *  - Search by keyword (optional)
 *  - View basic details (same line format for demo)
 *  - Add to cart
 *  - View cart summary
 *
 * This is intentionally minimal to support your Week‑5 coding deliverable.
 */
public class Main {

    public static void main(String[] args) {

        // Data layer
        ProductRepository repo = new InMemoryProductRepository();

        // Business layer: product browsing
        ProductService productService = new ProductService(repo);

        // Business layer: cart management
        CartService cartService = new CartService(repo, new Cart());

        System.out.println("=== Supermarket Demo ===");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1) Browse products");
            System.out.println("2) Search products");
            System.out.println("3) View product details (by id)");
            System.out.println("4) Add to cart");
            System.out.println("5) View cart");
            System.out.println("6) Clear cart");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                // Browse: show active products only
                List<Product> products = productService.getActiveProducts();
                for (Product p : products) {
                    System.out.println(p);
                }

            } else if (choice.equals("2")) {
                // Simple search: filter by name contains (case-insensitive in repo impl)
                System.out.print("Keyword: ");
                String keyword = scanner.nextLine();
                // For simplicity, reuse getAllProducts and filter here if you didn't implement search.
                // If you want to add a search method in ProductService, you can do that later.
                List<Product> products = productService.getActiveProducts();
                for (Product p : products) {
                    if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                        System.out.println(p);
                    }
                }

            } else if (choice.equals("3")) {
                // "Detail" demo: show the matching product line if active
                System.out.print("Product ID: ");
                String id = scanner.nextLine();
                List<Product> products = productService.getActiveProducts();
                boolean found = false;
                for (Product p : products) {
                    if (p.getId().equals(id)) {
                        System.out.println(p);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Product not found or not available.");
                }

            } else if (choice.equals("4")) {
                // Add to cart
                System.out.print("Product ID: ");
                String id = scanner.nextLine();
                System.out.print("Quantity: ");
                String qtyText = scanner.nextLine();

                try {
                    int qty = Integer.parseInt(qtyText);
                    cartService.addToCart(id, qty);
                    System.out.println("Added to cart.");
                } catch (NumberFormatException nfe) {
                    System.out.println("Please enter a valid number for quantity.");
                } catch (IllegalArgumentException | IllegalStateException ex) {
                    System.out.println("Cannot add to cart: " + ex.getMessage());
                }

            } else if (choice.equals("5")) {
                // View cart
                List<CartItem> lines = cartService.viewCart();
                if (lines.isEmpty()) {
                    System.out.println("Cart is empty.");
                } else {
                    for (CartItem line : lines) {
                        System.out.println(
                                line.getProduct().getName() +
                                        " x" + line.getQuantity() +
                                        " = " + String.format("%.2f", line.getLineTotal()) + " BHD"
                        );
                    }
                    System.out.println("TOTAL = " + String.format("%.2f", cartService.getCartTotal()) + " BHD");
                }

            } else if (choice.equals("6")) {
                // Optional: clear cart
                cartService.clearCart();
                System.out.println("Cart cleared.");

            } else if (choice.equals("0")) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid option");
            }
        }
    }
}