package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDateTime moment;
    OrderStatus status;

    private List<OrderItem> items = new ArrayList<>(); // cada pedido tem vários itens
    private Client client; // cada pedido tem 1 cliente

    public Order(){
        this.moment = LocalDateTime.now();
    }

    public Order(OrderStatus status, Client client) {
        this.moment = LocalDateTime.now();
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double totalPrice() {
        Double totalPrice = 0.0;
        for (OrderItem i : items) {
            totalPrice += i.subTotal();
        }
        return totalPrice;
    }



    public String toString() {
        StringBuilder sb = new StringBuilder(); // PERMITE CONCATENAR STRINGS
        sb.append("Order moment: " + formatter1.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " (" + formatter2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItem i : items) {
            sb.append(i.getProduct().getName() + ", $" + i.getProduct().getPrice() + ", Quantity: " + i.getQuantity() + ", Subtotal: $" + i.subTotal() + "\n");
        }
        sb.append("Total price: $" + totalPrice());
        return sb.toString();
    }
}





