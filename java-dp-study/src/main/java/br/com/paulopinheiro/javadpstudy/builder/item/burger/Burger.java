package br.com.paulopinheiro.javadpstudy.builder.item.burger;

import br.com.paulopinheiro.javadpstudy.builder.item.Item;
import br.com.paulopinheiro.javadpstudy.builder.item.packing.Packing;
import br.com.paulopinheiro.javadpstudy.builder.item.packing.Wrapper;

public abstract class Burger extends Item {
    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}
