package br.com.paulopinheiro.javadpstudy.behavioral.template;

import br.com.paulopinheiro.javadpstudy.behavioral.template.order.StoreOrder;
import br.com.paulopinheiro.javadpstudy.behavioral.template.order.NetOrder;
import br.com.paulopinheiro.javadpstudy.behavioral.template.order.OrderProcess;

public class Client {
    public static void main(String[] args) {
        OrderProcess netOrder = new NetOrder();
        OrderProcess storeOrder = new StoreOrder();

        System.out.println("************* Processing a Net Order ***************");
        netOrder.process(false);

        System.out.println("\n\n");

        System.out.println("************* Processing a Store Order ***************");
        storeOrder.process(true);
    }
}
