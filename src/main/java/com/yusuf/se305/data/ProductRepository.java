package com.yusuf.se305.data;

import com.yusuf.se305.model.Product;
import java.util.List;

/**
 * Repository Boundary for Products (Data Layer)
 *
 * Purpose:
 *  - Defines WHAT data operations we need for product browsing without
 *    committing to HOW data is stored or retrieved.
 *
 * Why an interface:
 *  - Supports your Phase 3 architecture decisions: clean separation of layers
 *    and easy modifiability (can switch from in-memory to JDBC/SQL later).
 *  - Aligns with CON-4 (must support SQL in the system): today it's in-memory,
 *    tomorrow you could add a JDBC implementation without changing business code.
 *
 * Supports Use Cases:
 *  - UC-10: Browse Products  -> getAllProducts()
 *  - UC-13: View detailed products (via business layer using the list here)
 */
public interface ProductRepository {

    /**
     * Retrieve all products (the business layer will decide which ones are visible).
     */
    List<Product> getAllProducts();
}