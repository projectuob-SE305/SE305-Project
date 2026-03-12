package com.yusuf.se305.data;

import com.yusuf.se305.model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * In-Memory Repository Implementation (Week-5 demo)
 *
 * Purpose:
 *  - A simple, fast data source to demonstrate browsing (UC-10, UC-13) without
 *    setting up a database yet. This helps you meet the coding milestone quickly.
 *  - Later, you can add a JDBC/SQL repository (CON-4) and keep the same interface.
 *
 * Quality Attribute Support:
 *  - QA-2 Performance (for demo): in-memory list returns results instantly.
 *  - QA-5 Testability: this class is easy to unit test and swap for test doubles.
 */
public class InMemoryProductRepository implements ProductRepository {

    private List<Product> products = new ArrayList<>();

    /**
     * Seed a tiny catalog to support the console browsing demo.
     * - Two active items are visible to customers.
     * - One inactive item will be filtered out by the business layer.
     */
    public InMemoryProductRepository() {
        products.add(new Product("P1", "Milk", 0.5, true));
        products.add(new Product("P2", "Bread", 0.3, true));
        products.add(new Product("P3", "Chocolate", 1.2, false)); // inactive (won't appear in browse)
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }
}