package tests.smoke.users;

import io.restassured.response.Response;
import models.users.request.UpdateUserRequest;
import models.users.response.User;
import org.junit.jupiter.api.Test;
import services.UserService;

import static org.junit.jupiter.api.Assertions.*;

public class UpdateUserTest {

    private final UserService users = new UserService();

    @Test
    public void shouldUpdateUser() {

        UpdateUserRequest body = new UpdateUserRequest();
        body.setId(1);
        body.setUsername("updatedUser");
        body.setEmail("updated@test.com");
        body.setPassword("newpass123");

        Response response = users.updateUser(1, body);

        System.out.println(response.asPrettyString());

        assertEquals(200, response.statusCode());

        User updated = response.as(User.class);

        assertEquals(body.getUsername(), updated.getUsername());
        assertEquals(body.getEmail(), updated.getEmail());
    }
}

