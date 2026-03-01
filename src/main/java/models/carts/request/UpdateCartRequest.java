package models.carts.request;

import java.util.List;

public class UpdateCartRequest {

    private int userId;
    private String date;
    private List<CartProductRequest> products;

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public List<CartProductRequest> getProducts() { return products; }
    public void setProducts(List<CartProductRequest> products) { this.products = products; }
}
