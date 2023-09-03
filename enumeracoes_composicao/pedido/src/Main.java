import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate clientBirth = LocalDate.parse(sc.next(), formatter);
        Client c1 = new Client(clientName, clientEmail, clientBirth);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        sc.nextLine();
        String orderStatus = sc.nextLine();
        System.out.print("How many items to this order? ");
        int itemsQuantity = sc.nextInt();

        Order order1 = new Order(OrderStatus.valueOf(orderStatus), c1);

        for(int i = 1; i <= itemsQuantity; i++){
            System.out.printf("Enter #" + i + " item data: \n");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order1.addItem(orderItem);
        }



        System.out.println("ORDER SUMARY: ");
        System.out.println(order1);






    }
}