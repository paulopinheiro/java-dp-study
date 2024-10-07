package br.com.paulopinheiro.javadpstudy.creational.builder.item.burger;

public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public float getPrice() {
        return (float) 14.00;
    }   
}
