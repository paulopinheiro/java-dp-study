package br.com.paulopinheiro.javadpstudy.builder.item.colddrink;

public class Coke extends ColdDrink {
    @Override
    public String getName() {
        return "Coca-cola";
    }

    @Override
    public float getPrice() {
        return (float) 8.00;
    }
}
