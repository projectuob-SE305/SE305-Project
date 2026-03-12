package com.yusuf.se305.model;

/**
 * Model: CartItem
 *
 * Represents one line in the shopping cart:
 *  - A product
 *  - The chosen quantity
 *
 * This class has no business logic; it only holds data and a helper to get the line total.
 */
public class CartItem {

    private final Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    /** Returns price * quantity for this cart line. */
    public double getLineTotal() {
        return product.getPrice() * quantity;
    }
}