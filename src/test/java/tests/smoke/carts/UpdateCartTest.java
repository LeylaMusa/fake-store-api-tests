package tests.smoke.carts;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import models.carts.request.CartProductRequest;
import models.carts.request.UpdateCartRequest;
import models.carts.response.Cart;
import services.CartService;



public class UpdateCartTest {

    private final CartService carts = new CartService();


    @Test
    public void shouldUpdateCarTest() {

        CartProductRequest p = new CartProductRequest();
        p.setProductId(2);
        p.setQuantity(1);

        UpdateCartRequest body = new UpdateCartRequest();
        body.setUserId(1);
        body.setDate("2025-02-10");
        body.setProducts(List.of(p));

        Response response = carts.updateCart(1, body);

        System.out.println(response.asPrettyString());

        assertEquals(200, response.statusCode());

        Cart updatedCart = response.as(Cart.class);

        assertEquals(1, updatedCart.getUserId());
        assertNotNull(updatedCart.getDate());
        assertNotNull(updatedCart.getProducts());

        assertFalse(updatedCart.getProducts().isEmpty());
        assertEquals(2, updatedCart.getProducts().get(0).getProductId());
        assertEquals(1, updatedCart.getProducts().get(0).getQuantity());
    }
}