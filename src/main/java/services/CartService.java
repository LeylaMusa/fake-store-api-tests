package services;

import core.ApiClient;
import io.restassured.response.Response;

    public class CartService {

        private final ApiClient api = new ApiClient();

        public Response getAllCarts() {
            return api.get("/carts");
        }

        public Response createCart(Object body) {
            return api.post("/carts", body);
        }
        public Response updateCart(int id, Object body) {
            return api.put("/carts/" + id, body);
        }

    }


