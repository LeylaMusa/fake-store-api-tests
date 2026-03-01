package models.carts.request;

import java.util.List;

public class CreateCartRequest {
    private int userId;
    private List<CartProductRequest> products;

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public List<CartProductRequest> getProducts() { return products; }
    public void setProducts(List<CartProductRequest> products) { this.products = products; }
}
