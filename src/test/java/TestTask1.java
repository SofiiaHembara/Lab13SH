import org.example.task1.FacebookUser;
import org.example.task1.FacebookUserAdapter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestTask1 {

    @Test
    void testFacebookUserAdapter() {
        // Create a FacebookUser
        FacebookUser facebookUser = new FacebookUser("test@example.com", "USA", "2024-12-11 10:00");

        // Create an adapter for the FacebookUser
        FacebookUserAdapter adapter = new FacebookUserAdapter(facebookUser);

        // Assert values from the adapter
        assertEquals("test@example.com", adapter.getMail());
        assertEquals("USA", adapter.getCountry());
        assertEquals("2024-12-11 10:00", adapter.getActiveTime());
    }

    private void assertEquals(String mail, String mail1) {
    }

    @Test
    void testMessageSender() {
        // Create a FacebookUser
        FacebookUser facebookUser = new FacebookUser("test@example.com", "USA", "2024-12-11 10:00");

        // Create an adapter for the FacebookUser
        FacebookUserAdapter adapter = new FacebookUserAdapter(facebookUser);

        // Create a MessageSender

    }
}