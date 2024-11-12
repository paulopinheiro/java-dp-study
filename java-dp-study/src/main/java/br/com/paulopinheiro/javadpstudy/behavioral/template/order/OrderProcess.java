package br.com.paulopinheiro.javadpstudy.behavioral.template.order;

//This is the template
public abstract class OrderProcess {
    //This is the template method
    public final void process(boolean isGift) {
        doSelect();
        doPayment();
        if (isGift) doWrap();
        doDelivery();
    }

    //This is an abstract primitive operation
    protected abstract void doSelect();
    protected abstract void doPayment();

    //This is an concrete primitive operation
    private void doWrap() {
        System.out.println("Gift wrap successful");
    }

    protected abstract void doDelivery();
}
