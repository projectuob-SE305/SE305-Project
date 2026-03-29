package com.yusuf.se305.business;

import com.yusuf.se305.data.InMemoryProductRepository;
import com.yusuf.se305.data.ProductRepository;
import com.yusuf.se305.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductServiceTest {

    @Test
    void getActiveProducts_returnsOnlyActiveProducts() {
        ProductRepository repository = new InMemoryProductRepository();
        ProductService service = new ProductService(repository);

        List<Product> products = service.getActiveProducts();

        for (Product product : products) {
            assertTrue(product.isActive());
        }
    }
}