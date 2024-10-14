package bmt;

public class Main {
    public static void main(final String[] args) {
        // Tworzymy sklep i dodajemy produkty
        Shop shop = new Shop();
        shop.addProduct(new Product("Laptop", 2500.00));
        shop.addProduct(new Product("Smartphone", 1200.00));
        shop.addProduct(new Product("Tablet", 800.00));

        // Wyświetlamy dostępne produkty
        System.out.println("Available products: ");
        shop.getAvailableProducts().forEach(System.out::println);

        // Tworzymy klienta i zamówienie
        Customer customer = new Customer("John Doe");
        Order order = shop.createOrder(customer);

        // Dodajemy produkty do zamówienia
        order.addProduct(shop.getAvailableProducts().get(0)); // Laptop
        order.addProduct(shop.getAvailableProducts().get(1)); // Smartphone

        // Wyświetlamy szczegóły zamówienia
        System.out.println("\nOrder details:");
        System.out.println(order);
    }
}
