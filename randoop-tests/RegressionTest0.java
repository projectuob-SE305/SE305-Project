
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    business.UserService userService0 = new business.UserService();
    boolean b3 = userService0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    business.UserService userService0 = new business.UserService();
    boolean b3 = userService0.login("", "hi!");
    boolean b6 = userService0.login("", "");
    boolean b9 = userService0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    boolean b11 = userService0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    business.UserService userService0 = new business.UserService();
    boolean b3 = userService0.login("", "hi!");
    boolean b6 = userService0.login("", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "", "");
    boolean b15 = userService0.login("hi!", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "");
    boolean b19 = userService0.login("", "");
    userService0.register("", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    business.UserService userService0 = new business.UserService();
    boolean b3 = userService0.login("", "hi!");
    boolean b6 = userService0.login("", "");
    boolean b9 = userService0.login("", "");
    boolean b12 = userService0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "", "hi!");
    boolean b15 = userService0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "");
    boolean b19 = userService0.login("", "");
    boolean b22 = userService0.login("", "hi!");
    userService0.register("", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "", "");
    boolean b15 = userService0.login("", "hi!");
    userService0.register("hi!", "hi!", "");
    boolean b22 = userService0.login("", "");
    boolean b25 = userService0.login("hi!", "");
    boolean b28 = userService0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    business.UserService userService0 = new business.UserService();
    boolean b3 = userService0.login("", "hi!");
    boolean b6 = userService0.login("", "");
    boolean b9 = userService0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "");
    boolean b19 = userService0.login("hi!", "");
    boolean b22 = userService0.login("hi!", "");
    userService0.register("", "hi!", "");
    boolean b29 = userService0.login("", "");
    userService0.register("", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "", "");
    boolean b15 = userService0.login("hi!", "");
    userService0.register("hi!", "hi!", "hi!");
    boolean b22 = userService0.login("", "");
    userService0.register("hi!", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "");
    userService0.register("hi!", "", "hi!");

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    business.UserService userService0 = new business.UserService();
    boolean b3 = userService0.login("", "hi!");
    boolean b6 = userService0.login("", "hi!");
    boolean b9 = userService0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    business.UserService userService0 = new business.UserService();
    boolean b3 = userService0.login("", "hi!");
    boolean b6 = userService0.login("", "");
    boolean b9 = userService0.login("", "");
    userService0.register("", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    business.UserService userService0 = new business.UserService();
    boolean b3 = userService0.login("", "hi!");
    boolean b6 = userService0.login("", "");
    userService0.register("hi!", "hi!", "hi!");
    boolean b13 = userService0.login("hi!", "");
    userService0.register("", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "", "hi!");
    userService0.register("", "hi!", "");

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "hi!");
    userService0.register("hi!", "", "");
    userService0.register("hi!", "hi!", "");
    boolean b19 = userService0.login("hi!", "hi!");
    userService0.register("hi!", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    business.UserService userService0 = new business.UserService();
    boolean b3 = userService0.login("", "hi!");
    boolean b6 = userService0.login("", "");
    boolean b9 = userService0.login("", "");
    userService0.register("hi!", "hi!", "");
    boolean b16 = userService0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    business.UserService userService0 = new business.UserService();
    userService0.register("", "hi!", "hi!");

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    business.UserService userService0 = new business.UserService();
    boolean b3 = userService0.login("", "hi!");
    userService0.register("", "hi!", "hi!");
    boolean b10 = userService0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

}
