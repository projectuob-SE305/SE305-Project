package com.yusuf.se305.business;

import com.yusuf.se305.data.InMemoryProductRepository;
import com.yusuf.se305.data.ProductRepository;
import com.yusuf.se305.model.Cart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {

    @Test
    void addToCart_validProduct_addsItem() {
        ProductRepository repository = new InMemoryProductRepository();
        CartService service = new CartService(repository, new Cart());

        service.addToCart("P1", 2);

        assertEquals(2, service.viewCart().get(0).getQuantity());
    }

    @Test
    void addToCart_zeroQuantity_throwsException() {
        ProductRepository repository = new InMemoryProductRepository();
        CartService service = new CartService(repository, new Cart());

        assertThrows(IllegalArgumentException.class, () -> {
            service.addToCart("P1", 0);
        });
    }

    @Test
    void addToCart_inactiveProduct_throwsException() {
        ProductRepository repository = new InMemoryProductRepository();
        CartService service = new CartService(repository, new Cart());

        assertThrows(IllegalStateException.class, () -> {
            service.addToCart("P3", 1);
        });
    }
}