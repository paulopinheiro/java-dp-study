package br.com.paulopinheiro.javadpstudy.creational.builder;

import br.com.paulopinheiro.javadpstudy.creational.builder.item.burger.VegBurger;
import br.com.paulopinheiro.javadpstudy.creational.builder.item.colddrink.Coke;

public class VegMealBuilder extends MealBuilder {
    private Meal meal;

    @Override
    public void buildBurger() {
        getMeal().addItem(new VegBurger());
    }

    @Override
    public void buildColdDrink() {
        getMeal().addItem(new Coke());
    }
}
