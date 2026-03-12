package com.yusuf.se305.business;

import com.yusuf.se305.data.ProductRepository;
import com.yusuf.se305.model.Cart;
import com.yusuf.se305.model.CartItem;
import com.yusuf.se305.model.Product;

import java.util.List;

/**
 * Business Service: CartService
 *
 * Minimal cart rules for the demo:
 *  - quantity must be > 0
 *  - product must exist
 *  - product must be active (visible/available)
 *
 * Responsibilities:
 *  - addToCart(productId, qty): validate and update the cart
 *  - viewCart(): return a copy of current items
 *  - getCartTotal(): sum of all line totals
 */
public class CartService {

    private final ProductRepository repository;
    private final Cart cart;

    public CartService(ProductRepository repository, Cart cart) {
        this.repository = repository;
        this.cart = cart;
    }

    /** Add a product to cart with basic validations. */
    public void addToCart(String productId, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }

        // Find product by id
        Product found = null;
        for (Product p : repository.getAllProducts()) {
            if (p.getId().equals(productId)) {
                found = p;
                break;
            }
        }

        if (found == null) {
            throw new IllegalArgumentException("Product not found: " + productId);
        }
        if (!found.isActive()) {
            throw new IllegalStateException("Product is not available for purchase: " + found.getName());
        }

        // Passed checks → add to cart
        cart.add(found, quantity);
    }

    /** View current cart lines. */
    public List<CartItem> viewCart() {
        return cart.getItems();
    }

    /** Total of the cart. */
    public double getCartTotal() {
        return cart.getTotal();
    }

    /** Optional: clear cart (useful for testing or demo reset). */
    public void clearCart() {
        cart.clear();
    }
}