import business.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    @DisplayName("Register and login success")
    void register() {
        UserService service = new UserService();

        service.register("Ali", "ali@gmail.com", "1234");

        boolean result = service.login("ali@gmail.com", "1234");

        assertTrue(result);
    }

    @Test
    @DisplayName("Login with wrong password")
    void login() {
        UserService service = new UserService();

        service.register("Ali", "ali@gmail.com", "1234");

        boolean result = service.login("ali@gmail.com", "0000");

        assertFalse(result);
    }
}