package br.com.paulopinheiro.javadpstudy.behavioral.command;

public class Stock {
    private final String name;
    private final int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Stock[Product: " + this.name
                         + ", Quantity: " + this.quantity + " bought]");
    }

    public void sell() {
        System.out.println("Stock[Product: " + this.name 
                         + ", Quantity: " + this.quantity + " sold]");
    }
}
