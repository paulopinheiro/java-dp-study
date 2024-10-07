package br.com.paulopinheiro.javadpstudy.builder;

import br.com.paulopinheiro.javadpstudy.builder.item.Item;
import java.util.LinkedList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public void addItem(Item item) {
        getItems().add(item);
    }

    public void showCost() {
        float sum = 0;
        for (Item i:getItems()) {
            sum+= i.getPrice();
        }
        System.out.println("Cost: " + Float.toString(sum));
    }

    public void showItems() {
        System.out.println("Meal items:");
        for (Item i:getItems()) {
            System.out.println(i);
        }
    }

    private List<Item> getItems() {
        if (items==null) items = new LinkedList<>();
        return items;
    }
}
