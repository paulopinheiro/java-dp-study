package br.com.paulopinheiro.javadpstudy.creational.builder;

public class Director {
    private MealBuilder mealBuilder;

    public void build(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
        mealBuilder.buildBurger();
        mealBuilder.buildColdDrink();
    }
}
