package br.com.paulopinheiro.javadpstudy.behavioral.command.order;

import br.com.paulopinheiro.javadpstudy.behavioral.command.Stock;

public class SellStock implements Order {
    private final Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell();
    }
}
