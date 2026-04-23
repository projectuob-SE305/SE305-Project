import data.User;
import data.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    @DisplayName("Testing UserRepository Functions")
    void testAddAndFindUser() {
        UserRepository repo = new UserRepository();

        User user = new User("Ali", "ali@gmail.com", "1234");
        repo.addUser(user);

        User found = repo.findUserByEmail("ali@gmail.com");

        assertNotNull(found);
        assertEquals("Ali", found.getName());
    }
}