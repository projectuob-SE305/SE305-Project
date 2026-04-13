import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = cartService2.getCartTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.model.Cart.getTotal()\" because \"this.cart\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        java.lang.Class<?> wildcardClass3 = cartService2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.clearCart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.model.Cart.clear()\" because \"this.cart\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yusuf.se305.model.CartItem> cartItemList3 = cartService2.viewCart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.model.Cart.getItems()\" because \"this.cart\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Quantity must be greater than zero.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yusuf.se305.data.ProductRepository productRepository0 = null;
        com.yusuf.se305.model.Cart cart1 = null;
        com.yusuf.se305.business.CartService cartService2 = new com.yusuf.se305.business.CartService(productRepository0, cart1);
        // The following exception was thrown during execution in test generation
        try {
            cartService2.addToCart("", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yusuf.se305.data.ProductRepository.getAllProducts()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

