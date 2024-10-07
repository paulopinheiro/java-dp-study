package br.com.paulopinheiro.javadpstudy.builder.item.colddrink;

import br.com.paulopinheiro.javadpstudy.builder.item.Item;
import br.com.paulopinheiro.javadpstudy.builder.item.packing.Bottle;
import br.com.paulopinheiro.javadpstudy.builder.item.packing.Packing;

public abstract class ColdDrink extends Item {
    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
