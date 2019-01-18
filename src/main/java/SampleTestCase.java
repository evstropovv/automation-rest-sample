import controller.UserController;
import models.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTestCase {

    private UserController userController;

    private String USERNAME = "evstropovv";

    @Before
    public void setUp() {
        userController = new UserController();
    }

    @Test
    public void testUserInfoResponse() {
        User user = userController.getUserByUsername(USERNAME);
        assertTrue(user.getLogin().contains(USERNAME));
    }
    @Test
    public void testFollowers(){
        User[] followers = userController.getFollowersByUser(USERNAME);
        assertFalse(followers.length == 0);
    }
}
