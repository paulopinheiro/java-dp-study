package br.com.paulopinheiro.javadpstudy.behavioral.interpreter;

public class Context {
    private final String input;

    public Context(String input) {
        this.input = input;
    }

    public boolean getResult(String data) {
        return input.contains(data);
    }
}
