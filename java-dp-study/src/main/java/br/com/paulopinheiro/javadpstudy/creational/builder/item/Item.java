package br.com.paulopinheiro.javadpstudy.creational.builder.item;

import br.com.paulopinheiro.javadpstudy.creational.builder.item.packing.Packing;

public abstract class Item {
    public abstract String getName();
    public abstract float getPrice();
    public abstract Packing getPacking();

    @Override
    public String toString() {
       return "\t" + getPacking().pack() + " of " + getName() + " - " + Float.toString(getPrice());
    }
}
