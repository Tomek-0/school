package bmt;

public class Customer {
    private String name;
    private int unusedVariable;  // Dodana nieużywana zmienna

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "'}";
    }
}
