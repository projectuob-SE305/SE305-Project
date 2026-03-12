package com.yusuf.se305.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Model: Cart
 *
 * A simple cart that keeps a list of CartItem objects.
 * Methods:
 *  - add(Product, qty): add new or increase existing quantity
 *  - getItems(): list all cart lines
 *  - getTotal(): sum of line totals
 *  - clear(): empty the cart
 *
 * Kept intentionally simple for Week-5 demo.
 */
public class Cart {

    private final List<CartItem> items = new ArrayList<>();

    /** Add a product to the cart; if already present, increase its quantity. */
    public void add(Product product, int quantity) {
        // Find an existing line for the same product (by id)
        for (CartItem line : items) {
            if (line.getProduct().getId().equals(product.getId())) {
                line.setQuantity(line.getQuantity() + quantity);
                return;
            }
        }
        // Not found → add new line
        items.add(new CartItem(product, quantity));
    }

    /** Current snapshot of items. */
    public List<CartItem> getItems() {
        return new ArrayList<>(items);
    }

    /** Sum of all line totals. */
    public double getTotal() {
        double total = 0.0;
        for (CartItem line : items) {
            total += line.getLineTotal();
        }
        return total;
    }

    /** Remove everything from the cart. */
    public void clear() {
        items.clear();
    }

    /** Returns true if the cart has no items. */
    public boolean isEmpty() {
        return items.isEmpty();
    }
}