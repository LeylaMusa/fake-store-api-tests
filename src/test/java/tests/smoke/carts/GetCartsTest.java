package tests.smoke.carts;

import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import models.carts.response.Cart;
import models.carts.response.CartProduct;
import org.junit.jupiter.api.Test;
import services.CartService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GetCartsTest {

    private final CartService carts = new CartService();

    @Test
    public void shouldGetAllCarts() {

        Response response = carts.getAllCarts();
        assertEquals(200, response.statusCode());

        List<Cart> cartList = response.as(new TypeRef<List<Cart>>() {});
        assertFalse(cartList.isEmpty());

        Cart first = cartList.get(0);
        assertTrue(first.getId() > 0);
        assertTrue(first.getUserId() > 0);
        assertNotNull(first.getDate());

        assertNotNull(first.getProducts());
        assertFalse(first.getProducts().isEmpty());

        CartProduct item = first.getProducts().get(0);
        assertTrue(item.getProductId() > 0);
        assertTrue(item.getQuantity() > 0);
        System.out.println(response.asPrettyString());
    }
}


