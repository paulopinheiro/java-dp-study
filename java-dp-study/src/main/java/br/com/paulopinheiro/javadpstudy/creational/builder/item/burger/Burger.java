package br.com.paulopinheiro.javadpstudy.creational.builder.item.burger;

import br.com.paulopinheiro.javadpstudy.creational.builder.item.Item;
import br.com.paulopinheiro.javadpstudy.creational.builder.item.packing.Packing;
import br.com.paulopinheiro.javadpstudy.creational.builder.item.packing.Wrapper;

public abstract class Burger extends Item {
    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}
