package br.com.paulopinheiro.javadpstudy.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(10,5);

        context.executeStrategy(new OperationAdd());
        context.executeStrategy(new OperationMultiply());
        context.executeStrategy(new OperationSubtract());
    }
}
