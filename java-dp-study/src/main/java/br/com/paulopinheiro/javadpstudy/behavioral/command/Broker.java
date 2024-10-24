package br.com.paulopinheiro.javadpstudy.behavioral.command;

import br.com.paulopinheiro.javadpstudy.behavioral.command.order.Order;
import java.util.ArrayList;
import java.util.List;

public class Broker {
    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        this.orderList.add(order);
    }

    public void placeOrders() {
        System.out.println("Placing " + this.orderList.size() + " orders\n");
        for (Order o:this.orderList) o.execute();
    }
}
