package br.com.paulopinheiro.javadpstudy.builder.item.burger;

public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public float getPrice() {
        return (float) 12.00;
    }
}
