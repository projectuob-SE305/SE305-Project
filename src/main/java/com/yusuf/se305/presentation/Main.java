package com.yusuf.se305.presentation;

import com.yusuf.se305.business.ProductService;
import com.yusuf.se305.data.InMemoryProductRepository;
import com.yusuf.se305.model.Product;
import java.util.List;

/**
 * Console Presentation (Temporary Demo)
 *
 * Purpose:
 *  - Minimal console output to demonstrate Phase 2 use cases for your coding milestone.
 *  - Non-authenticated access shows browsing only (CON-5: users can browse without account).
 *
 * Demo Flow:
 *  1) Create the data source (in-memory).
 *  2) Create the service (business rules).
 *  3) Request active products and print them.
 *
 * Maps to Use Cases:
 *  - UC-10 Browse Products: shows a simple list of products.
 *  - UC-13 View detailed products: in a real app, you'd show more fields for a selected product.
 *    (Here we print toString(); you can extend Product with more fields later if required.)
 */
public class Main {

    public static void main(String[] args) {

        // (1) Data layer: in-memory repository for Week-5 demo.
        InMemoryProductRepository repo = new InMemoryProductRepository();

        // (2) Business layer: apply visibility rules (filters inactive products).
        ProductService service = new ProductService(repo);

        // (3) Presentation: print active products (UC-10).
        System.out.println("Available products:");

        List<Product> products = service.getActiveProducts();

        for (Product p : products) {
            System.out.println(p);
        }

        // Note:
        // - No cart or checkout here yet (those come with UC-14+ in the next steps).
        // - This keeps your Week-5 submission focused and clean.
    }
}
