package tests.smoke.users;


import io.restassured.response.Response;
import models.users.request.CreateUserRequest;
import models.users.request.Name;
import models.users.response.User;
import org.junit.jupiter.api.Test;
import services.UserService;

import static org.junit.jupiter.api.Assertions.*;

public class CreateUserTest {

    private final UserService users = new UserService();

    @Test
    public void shouldCreateUser() {

        CreateUserRequest body = new CreateUserRequest();
        body.setEmail("test@test.com");
        body.setUsername("testuser");
        body.setPassword("123456");

        Name name = new Name();
        name.setFirstname("Leyla");
        name.setLastname("QA");
        body.setName(name);

        Response response = users.createUser(body);

        System.out.println(response.asPrettyString());

        assertEquals(201, response.statusCode());

        User created = response.as(User.class);

        int id = response.jsonPath().getInt("id");
        assertTrue(id > 0);

    }
}
