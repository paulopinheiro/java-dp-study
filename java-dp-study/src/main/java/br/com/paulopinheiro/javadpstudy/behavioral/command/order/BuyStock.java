package br.com.paulopinheiro.javadpstudy.behavioral.command.order;

import br.com.paulopinheiro.javadpstudy.behavioral.command.Stock;

public class BuyStock implements Order {
    private final Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
