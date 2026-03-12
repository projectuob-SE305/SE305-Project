package com.yusuf.se305.business;

import com.yusuf.se305.data.ProductRepository;
import com.yusuf.se305.model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * Business Service for Product Browsing
 *
 * Responsibilities:
 *  - Implements browsing/visibility rules for products.
 *  - Filters out inactive items so customers only see available products.
 *
 * Use Cases (Phase 2):
 *  - UC-10: Browse Products
 *      The service returns only active products for listing.
 *  - UC-13: View detailed products
 *      The same active products can be used to show short/long detail views.
 *
 * Design Note:
 *  - The service depends on the repository interface, not the concrete class.
 *    This matches your layered design and supports modifiability (replace data source later).
 */
public class ProductService {

    private ProductRepository repository;

    /**
     * Dependency Injection:
     *  - Pass any ProductRepository implementation (in-memory now, JDBC later).
     */
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    /**
     * Return only active products to the presentation layer.
     * - Keeps inactive items hidden from customers.
     * - Simple loop for readability (beginner friendly).
     */
    public List<Product> getActiveProducts() {
        List<Product> result = new ArrayList<>();

        for (Product p : repository.getAllProducts()) {
            if (p.isActive()) {
                result.add(p);
            }
        }
        return result;
    }
}