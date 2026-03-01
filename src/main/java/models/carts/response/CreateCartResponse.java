package models.carts.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCartResponse {

    private int id;
    private int userId;
    private List<CreateCartProduct> products;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public List<CreateCartProduct> getProducts() { return products; }
    public void setProducts(List<CreateCartProduct> products) { this.products = products; }
}
