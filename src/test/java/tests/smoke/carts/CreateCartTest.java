package tests.smoke.carts;

import io.restassured.response.Response;
import models.carts.request.CartProductRequest;
import models.carts.request.CreateCartRequest;
import models.carts.response.CreateCartResponse;
import org.junit.jupiter.api.Test;
import services.CartService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCartTest {

    private final CartService carts = new CartService();

    @Test
    public void shouldCreateCart() {

        CartProductRequest p = new CartProductRequest();
        p.setProductId(1);
        p.setQuantity(5);

        CreateCartRequest body = new CreateCartRequest();
        body.setUserId(1);
        body.setProducts(List.of(p));

        Response response = carts.createCart(body);

        System.out.println(response.asPrettyString());
        assertEquals(201, response.statusCode());

        CreateCartResponse created = response.as(CreateCartResponse.class);

        assertTrue(created.getId() > 0);
        assertEquals(body.getUserId(), created.getUserId());

        assertNotNull(created.getProducts());
        assertFalse(created.getProducts().isEmpty());
        assertEquals(0, created.getProducts().get(0).getId());

    }
}
