package br.com.paulopinheiro.javadpstudy.behavioral.template.order;

public class NetOrder extends OrderProcess {
    @Override
    protected void doSelect() {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preference");
        System.out.println("Get delivery address");
    }

    @Override
    protected void doPayment() {
        System.out.println("Online Payment through Netbanking, card or Paypal");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Ship the item through post office to delivery address");
    }
}
