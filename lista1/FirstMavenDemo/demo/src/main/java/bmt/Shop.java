package bmt;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> availableProducts;

    public Shop() {
        availableProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        availableProducts.add(product);
    }

    public List<Product> getAvailableProducts() {
        return availableProducts;
    }

    public Order createOrder(Customer customer) {
        return new Order(customer);
    }
}
