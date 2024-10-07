package br.com.paulopinheiro.javadpstudy.builder;

import br.com.paulopinheiro.javadpstudy.builder.item.burger.VegBurger;
import br.com.paulopinheiro.javadpstudy.builder.item.colddrink.Coke;

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
