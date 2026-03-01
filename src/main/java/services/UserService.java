package services;
import core.ApiClient;
import io.restassured.response.Response;

public class UserService {

    private final ApiClient api = new ApiClient();

    public Response getUserById(int id) {
        return api.get("/users/" + id);
    }

    public Response getAllUsers() {
        return api.get("/users");
    }
    public Response createUser(Object body) {
        return api.post("/users", body);
    }
    public Response updateUser(int id, Object body) {
        return api.put("/users/" + id, body);
    }


}

