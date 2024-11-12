package br.com.paulopinheiro.javadpstudy.behavioral.template.order;

public class StoreOrder extends OrderProcess {
    @Override
    protected void doSelect() {
        System.out.println("Customer chooses the item from shelf");
    }

    @Override
    protected void doPayment() {
        System.out.println("Pays at counter through cash/POS");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Item delivered to in delivery counter");
    }
}
