package br.com.paulopinheiro.javadpstudy.behavioral.command;

import br.com.paulopinheiro.javadpstudy.behavioral.command.order.BuyStock;
import br.com.paulopinheiro.javadpstudy.behavioral.command.order.Order;
import br.com.paulopinheiro.javadpstudy.behavioral.command.order.SellStock;

public class Client {
    public static void main(String[] args) {
        Broker broker = new Broker();

        Order order1 = new BuyStock(new Stock("cookie",12));
        Order order2 = new BuyStock(new Stock("bread",20));
        Order order3 = new SellStock(new Stock("milk",5));
        Order order4 = new SellStock(new Stock("bread",5));

        broker.takeOrder(order1);
        broker.takeOrder(order2);
        broker.takeOrder(order3);
        broker.takeOrder(order4);

        broker.placeOrders();
    }
}
