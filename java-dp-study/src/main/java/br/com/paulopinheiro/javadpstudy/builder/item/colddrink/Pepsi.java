package br.com.paulopinheiro.javadpstudy.builder.item.colddrink;

public class Pepsi extends ColdDrink {
    @Override
    public String getName() {
        return "Pepsi-cola";
    }

    @Override
    public float getPrice() {
        return (float) 7.00;
    }
}
