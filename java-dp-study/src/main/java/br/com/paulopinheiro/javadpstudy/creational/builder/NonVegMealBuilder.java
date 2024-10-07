package br.com.paulopinheiro.javadpstudy.creational.builder;

import br.com.paulopinheiro.javadpstudy.creational.builder.item.burger.ChickenBurger;
import br.com.paulopinheiro.javadpstudy.creational.builder.item.colddrink.Pepsi;

public class NonVegMealBuilder extends MealBuilder {
    
    @Override
    public void buildBurger() {
        this.getMeal().addItem(new ChickenBurger());
    }

    @Override
    public void buildColdDrink() {
        this.getMeal().addItem(new Pepsi());
    }
}
