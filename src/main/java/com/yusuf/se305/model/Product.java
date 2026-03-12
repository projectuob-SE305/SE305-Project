package com.yusuf.se305.model;

/**
 * Domain Model: Product
 *
 * Purpose:
 *  - Represents a product that can be displayed when the user browses (UC-10)
 *    and viewed in detail (UC-13).
 *  - This class is intentionally simple to support clean separation of layers:
 *    model (data), data (repositories), business (services), presentation (Main).
 *
 * Fields:
 *  - id:       Unique product identifier (e.g., "P1").
 *  - name:     Display name shown during browsing/detail.
 *  - price:    Price to be shown to the customer (read-only scenario here).
 *  - active:   Whether the item is visible/available for customers.
 *
 * Related Requirements (Phase 2):
 *  - UC-10 Browse Products: product name and price must appear in lists.
 *  - UC-13 View detailed products: model must expose attributes to show details.
 *  - CON-5: Non-authenticated users can browse but not purchase;
 *           this model is used by browsing, not enforcing auth here (handled in other layers).
 */
public class Product {

    private String id;
    private String name;
    private double price;
    private boolean active;

    /**
     * Basic constructor used by the data layer to seed data or build products
     * retrieved from a future database implementation.
     */
    public Product(String id, String name, double price, boolean active) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.active = active;
    }

    // --- Getters (used by services and presentation to read product data) ---

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /**
     * active == true means the product is visible for customers when browsing.
     */
    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        // Keep output short and readable for console demo in presentation layer.
        return id + " - " + name + " (" + price + " BHD)";
    }
}