package br.com.paulopinheiro.javadpstudy.behavioral.strategy;

public class Context {
    private final int operator1, operator2;

    public Context(int operator1, int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public void executeStrategy(Strategy strategy) {
        strategy.doOperation(this.operator1, this.operator2);
    }
}
