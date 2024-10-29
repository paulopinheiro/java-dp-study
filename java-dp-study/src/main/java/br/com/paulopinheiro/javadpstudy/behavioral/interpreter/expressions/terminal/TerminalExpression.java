package br.com.paulopinheiro.javadpstudy.behavioral.interpreter.expressions.terminal;

import br.com.paulopinheiro.javadpstudy.behavioral.interpreter.Context;
import br.com.paulopinheiro.javadpstudy.behavioral.interpreter.expressions.Expression;

public class TerminalExpression implements Expression {
    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getResult(data);
    }
}
