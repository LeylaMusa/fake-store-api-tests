package models.carts.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cart {
    private int id;
    private int userId;
    private String date;
    private List<CartProduct> products;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public List<CartProduct> getProducts() { return products; }
    public void setProducts(List<CartProduct> products) { this.products = products; }
}
