package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        java.lang.Class<?> wildcardClass2 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        java.lang.Class<?> wildcardClass1 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        java.lang.Class<?> wildcardClass4 = orderService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        java.lang.Class<?> wildcardClass4 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        java.lang.Class<?> wildcardClass3 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        java.util.List<java.lang.String> strList1 = orderRepository0.getAllOrders();
        java.lang.Class<?> wildcardClass2 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        boolean boolean5 = orderService2.processOrder((double) (byte) -1, "");
        java.lang.Class<?> wildcardClass6 = orderService2.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        int int8 = orderRepository0.getOrderCount();
        java.lang.Class<?> wildcardClass9 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        java.lang.Class<?> wildcardClass8 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        int int8 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList9 = orderRepository0.getAllOrders();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        java.util.List<java.lang.String> strList1 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("");
        java.lang.Class<?> wildcardClass4 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        java.lang.Class<?> wildcardClass5 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList2 = orderRepository0.getAllOrders();
        java.lang.Class<?> wildcardClass3 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        boolean boolean5 = orderService2.processOrder((double) (byte) -1, "");
        boolean boolean8 = orderService2.processOrder((double) 100, "hi!");
        java.lang.Class<?> wildcardClass9 = orderService2.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        java.lang.Class<?> wildcardClass4 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        int int7 = orderRepository0.getOrderCount();
        java.lang.Class<?> wildcardClass8 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("");
        int int10 = orderRepository0.getOrderCount();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList2 = orderRepository0.getAllOrders();
        int int3 = orderRepository0.getOrderCount();
        int int4 = orderRepository0.getOrderCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        Business.OrderService orderService4 = new Business.OrderService(orderRepository0);
        java.lang.Class<?> wildcardClass5 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        Business.OrderService orderService1 = new Business.OrderService(orderRepository0);
        java.lang.Class<?> wildcardClass2 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        int int8 = orderRepository0.getOrderCount();
        int int9 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        boolean boolean5 = orderService2.processOrder((double) (byte) -1, "");
        boolean boolean8 = orderService2.processOrder((double) 100, "hi!");
        boolean boolean11 = orderService2.processOrder((double) (short) 100, "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        java.lang.Class<?> wildcardClass7 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        Business.OrderService orderService4 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService5 = new Business.OrderService(orderRepository0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        boolean boolean5 = orderService2.processOrder((double) (byte) -1, "");
        boolean boolean8 = orderService2.processOrder((double) 100, "hi!");
        boolean boolean11 = orderService2.processOrder((double) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService8 = new Business.OrderService(orderRepository0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        java.lang.Class<?> wildcardClass8 = orderService7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        boolean boolean5 = orderService2.processOrder((double) (byte) -1, "");
        boolean boolean8 = orderService2.processOrder((double) ' ', "");
        java.lang.Class<?> wildcardClass9 = orderService2.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        int int7 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList8 = orderRepository0.getAllOrders();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        int int6 = orderRepository0.getOrderCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        int int8 = orderRepository0.getOrderCount();
        Business.OrderService orderService9 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList10 = orderRepository0.getAllOrders();
        int int11 = orderRepository0.getOrderCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        boolean boolean5 = orderService2.processOrder(0.0d, "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        int int8 = orderRepository0.getOrderCount();
        int int9 = orderRepository0.getOrderCount();
        int int10 = orderRepository0.getOrderCount();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        boolean boolean6 = orderService3.processOrder((double) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList8 = orderRepository0.getAllOrders();
        java.lang.Class<?> wildcardClass9 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        int int3 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        java.lang.Class<?> wildcardClass6 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        boolean boolean6 = orderService3.processOrder(0.0d, "hi!");
        boolean boolean9 = orderService3.processOrder((double) (short) 10, "");
        boolean boolean12 = orderService3.processOrder((double) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        int int4 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("");
        java.lang.Class<?> wildcardClass7 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        int int3 = orderRepository0.getOrderCount();
        int int4 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("");
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList8 = orderRepository0.getAllOrders();
        Business.OrderService orderService9 = new Business.OrderService(orderRepository0);
        boolean boolean12 = orderService9.processOrder(100.0d, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList8 = orderRepository0.getAllOrders();
        int int9 = orderRepository0.getOrderCount();
        int int10 = orderRepository0.getOrderCount();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        java.util.List<java.lang.String> strList5 = orderRepository0.getAllOrders();
        int int6 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        Business.OrderService orderService1 = new Business.OrderService(orderRepository0);
        boolean boolean4 = orderService1.processOrder((double) 10L, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("");
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        int int8 = orderRepository0.getOrderCount();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        int int4 = orderRepository0.getOrderCount();
        java.lang.Class<?> wildcardClass5 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        boolean boolean6 = orderService3.processOrder((double) 0.0f, "hi!");
        boolean boolean9 = orderService3.processOrder((double) 100, "hi!");
        boolean boolean12 = orderService3.processOrder((double) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        java.util.List<java.lang.String> strList5 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("");
        int int8 = orderRepository0.getOrderCount();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        orderRepository0.saveOrder("");
        int int6 = orderRepository0.getOrderCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        int int3 = orderRepository0.getOrderCount();
        int int4 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        int int4 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("");
        int int7 = orderRepository0.getOrderCount();
        java.lang.Class<?> wildcardClass8 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        java.util.List<java.lang.String> strList6 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("");
        java.lang.Class<?> wildcardClass9 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        boolean boolean6 = orderService3.processOrder(0.0d, "hi!");
        boolean boolean9 = orderService3.processOrder((double) (short) 10, "");
        boolean boolean12 = orderService3.processOrder((double) 1.0f, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("");
        java.util.List<java.lang.String> strList10 = orderRepository0.getAllOrders();
        int int11 = orderRepository0.getOrderCount();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        Business.OrderService orderService8 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList9 = orderRepository0.getAllOrders();
        int int10 = orderRepository0.getOrderCount();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        java.util.List<java.lang.String> strList5 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("");
        Business.OrderService orderService8 = new Business.OrderService(orderRepository0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        boolean boolean5 = orderService2.processOrder((double) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        int int7 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        boolean boolean5 = orderService2.processOrder(0.0d, "");
        boolean boolean8 = orderService2.processOrder((double) 100.0f, "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        java.util.List<java.lang.String> strList6 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("");
        int int9 = orderRepository0.getOrderCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        Business.OrderService orderService1 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        boolean boolean5 = orderService2.processOrder((double) 1L, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        Business.OrderService orderService4 = new Business.OrderService(orderRepository0);
        int int5 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList6 = orderRepository0.getAllOrders();
        int int7 = orderRepository0.getOrderCount();
        Business.OrderService orderService8 = new Business.OrderService(orderRepository0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        int int8 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("");
        int int11 = orderRepository0.getOrderCount();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("");
        Business.OrderService orderService10 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList11 = orderRepository0.getAllOrders();
        Business.OrderService orderService12 = new Business.OrderService(orderRepository0);
        boolean boolean15 = orderService12.processOrder((double) 1.0f, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        Business.OrderService orderService1 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList2 = orderRepository0.getAllOrders();
        java.util.List<java.lang.String> strList3 = orderRepository0.getAllOrders();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        Business.OrderService orderService1 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList2 = orderRepository0.getAllOrders();
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        orderRepository0.saveOrder("");
        Business.OrderService orderService8 = new Business.OrderService(orderRepository0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("");
        Business.OrderService orderService10 = new Business.OrderService(orderRepository0);
        int int11 = orderRepository0.getOrderCount();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        int int3 = orderRepository0.getOrderCount();
        Business.OrderService orderService4 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("");
        int int7 = orderRepository0.getOrderCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList8 = orderRepository0.getAllOrders();
        Business.OrderService orderService9 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService10 = new Business.OrderService(orderRepository0);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService5 = new Business.OrderService(orderRepository0);
        java.lang.Class<?> wildcardClass6 = orderService5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("");
        orderRepository0.saveOrder("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        int int8 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        int int11 = orderRepository0.getOrderCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList8 = orderRepository0.getAllOrders();
        int int9 = orderRepository0.getOrderCount();
        java.lang.Class<?> wildcardClass10 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        int int8 = orderRepository0.getOrderCount();
        Business.OrderService orderService9 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList10 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("");
        java.util.List<java.lang.String> strList13 = orderRepository0.getAllOrders();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        boolean boolean9 = orderService6.processOrder((double) 1, "");
        boolean boolean12 = orderService6.processOrder(100.0d, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        Business.OrderService orderService1 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList2 = orderRepository0.getAllOrders();
        int int3 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        int int5 = orderRepository0.getOrderCount();
        int int6 = orderRepository0.getOrderCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("");
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        java.util.List<java.lang.String> strList5 = orderRepository0.getAllOrders();
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        boolean boolean6 = orderService3.processOrder(0.0d, "hi!");
        boolean boolean9 = orderService3.processOrder(10.0d, "");
        boolean boolean12 = orderService3.processOrder((double) 10L, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        java.lang.Class<?> wildcardClass6 = orderRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        orderRepository0.saveOrder("hi!");
        int int8 = orderRepository0.getOrderCount();
        java.lang.Class<?> wildcardClass9 = orderRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        Business.OrderService orderService8 = new Business.OrderService(orderRepository0);
        boolean boolean11 = orderService8.processOrder((double) ' ', "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("");
        java.util.List<java.lang.String> strList10 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("hi!");
        java.util.List<java.lang.String> strList13 = orderRepository0.getAllOrders();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        int int8 = orderRepository0.getOrderCount();
        int int9 = orderRepository0.getOrderCount();
        Business.OrderService orderService10 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService11 = new Business.OrderService(orderRepository0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        boolean boolean5 = orderService2.processOrder((double) (byte) -1, "");
        boolean boolean8 = orderService2.processOrder((double) ' ', "");
        boolean boolean11 = orderService2.processOrder((double) 1, "hi!");
        boolean boolean14 = orderService2.processOrder((double) (short) 0, "");
        boolean boolean17 = orderService2.processOrder((double) 10, "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList2 = orderRepository0.getAllOrders();
        int int3 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        Business.OrderService orderService5 = new Business.OrderService(orderRepository0);
        boolean boolean8 = orderService5.processOrder((double) 100L, "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        int int8 = orderRepository0.getOrderCount();
        int int9 = orderRepository0.getOrderCount();
        Business.OrderService orderService10 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        java.util.List<java.lang.String> strList13 = orderRepository0.getAllOrders();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("");
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        int int8 = orderRepository0.getOrderCount();
        int int9 = orderRepository0.getOrderCount();
        Business.OrderService orderService10 = new Business.OrderService(orderRepository0);
        int int11 = orderRepository0.getOrderCount();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        java.util.List<java.lang.String> strList6 = orderRepository0.getAllOrders();
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        orderRepository0.saveOrder("hi!");
        int int4 = orderRepository0.getOrderCount();
        int int5 = orderRepository0.getOrderCount();
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("");
        Business.OrderService orderService10 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList11 = orderRepository0.getAllOrders();
        Business.OrderService orderService12 = new Business.OrderService(orderRepository0);
        int int13 = orderRepository0.getOrderCount();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("");
        Business.OrderService orderService10 = new Business.OrderService(orderRepository0);
        boolean boolean13 = orderService10.processOrder((double) (byte) 1, "hi!");
        boolean boolean16 = orderService10.processOrder((double) 10L, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        orderRepository0.saveOrder("");
        Business.OrderService orderService3 = new Business.OrderService(orderRepository0);
        orderRepository0.saveOrder("hi!");
        Business.OrderService orderService6 = new Business.OrderService(orderRepository0);
        Business.OrderService orderService7 = new Business.OrderService(orderRepository0);
        java.util.List<java.lang.String> strList8 = orderRepository0.getAllOrders();
        Business.OrderService orderService9 = new Business.OrderService(orderRepository0);
        boolean boolean12 = orderService9.processOrder((double) (short) 100, "hi!");
        boolean boolean15 = orderService9.processOrder((double) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass16 = orderService9.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList2 = orderRepository0.getAllOrders();
        int int3 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        orderRepository0.saveOrder("");
        java.util.List<java.lang.String> strList7 = orderRepository0.getAllOrders();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Data.OrderRepository orderRepository0 = new Data.OrderRepository();
        int int1 = orderRepository0.getOrderCount();
        Business.OrderService orderService2 = new Business.OrderService(orderRepository0);
        int int3 = orderRepository0.getOrderCount();
        java.util.List<java.lang.String> strList4 = orderRepository0.getAllOrders();
        java.util.List<java.lang.String> strList5 = orderRepository0.getAllOrders();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }
}

