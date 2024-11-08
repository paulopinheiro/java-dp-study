package br.com.paulopinheiro.javadpstudy.behavioral.strategy;

public class OperationSubtract implements Strategy {
    @Override
    public void doOperation(int operator1, int operator2) {
        System.out.println(operator1 + " - " + operator2 + " = " + (operator1-operator2));
    }
}
