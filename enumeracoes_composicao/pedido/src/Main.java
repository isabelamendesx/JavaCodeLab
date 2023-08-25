import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus status1 = OrderStatus.DELIVERED;

        OrderStatus status2 = OrderStatus.valueOf("DELIVERED");








    }

}