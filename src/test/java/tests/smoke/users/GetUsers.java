package tests.smoke.users;

import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import models.users.response.User;
import org.junit.jupiter.api.Test;
import services.UserService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GetUsers {

    private final UserService users = new UserService();

    @Test
    public void shouldGetAllUsers() {

        Response response = users.getAllUsers();

        assertEquals(200, response.statusCode());

        List<User> usersList =
                response.as(new TypeRef<List<User>>() {});

        assertFalse(usersList.isEmpty());

        assertTrue(usersList.size() >= 5);

        usersList.forEach(user -> {

            assertNotNull(user.getId());
            assertTrue(user.getId() > 0);

            assertNotNull(user.getEmail());
            assertTrue(user.getEmail().contains("@"));

            assertNotNull(user.getUsername());

            assertNotNull(user.getPhone());

            assertNotNull(user.getName());
            assertNotNull(user.getName().getFirstname());
            assertNotNull(user.getName().getLastname());

            assertNotNull(user.getAddress());
            assertNotNull(user.getAddress().getCity());

            assertNotNull(user.getAddress().getGeolocation());
            assertNotNull(user.getAddress().getGeolocation().getLat());
        });
    }

    @Test
    public void shouldGetUserById() {

        Response response = users.getUserById(1);

        assertEquals(200, response.statusCode());

        User user = response.as(User.class);

        assertEquals(1, user.getId());
        assertNotNull(user.getEmail());
        assertNotNull(user.getUsername());

        assertNotNull(user.getName());
        assertNotNull(user.getName().getFirstname());

        assertNotNull(user.getAddress());
        assertNotNull(user.getAddress().getCity());
    }
}
