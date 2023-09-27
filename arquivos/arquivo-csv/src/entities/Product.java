package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;
    private double totalPrice;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalPrice = price * quantity;
    }

    @Override
    public String toString() {
        return name + "," + totalPrice;
    }
}
