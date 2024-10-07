package br.com.paulopinheiro.javadpstudy.creational.builder;

public abstract class MealBuilder {
    private Meal meal;

    public abstract void buildBurger();
    public abstract void buildColdDrink();

    public Meal getMeal() {
        if (this.meal==null) this.meal=new Meal();
        return this.meal;
    }
}
