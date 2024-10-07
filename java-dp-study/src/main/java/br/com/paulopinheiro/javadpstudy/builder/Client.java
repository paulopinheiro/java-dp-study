package br.com.paulopinheiro.javadpstudy.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        MealBuilder vegBuilder = new VegMealBuilder();
        MealBuilder nonVegBuilder = new NonVegMealBuilder();
        
        director.build(vegBuilder);
        Meal vegMeal = vegBuilder.getMeal();
        vegMeal.showItems();
        vegMeal.showCost();

        System.out.println();

        director.build(nonVegBuilder);
        Meal nonVegMeal = nonVegBuilder.getMeal();
        nonVegMeal.showItems();
        nonVegMeal.showCost();
    }
}
