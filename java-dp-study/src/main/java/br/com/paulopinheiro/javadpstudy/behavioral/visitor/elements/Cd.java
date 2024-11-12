package br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements;

import br.com.paulopinheiro.javadpstudy.behavioral.visitor.visitors.Visitor;

public class Cd implements Element {
    private final String name;
    private final int price;
    private final int weight;

    public Cd(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
