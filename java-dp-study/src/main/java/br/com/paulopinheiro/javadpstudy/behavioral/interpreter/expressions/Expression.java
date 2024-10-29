package br.com.paulopinheiro.javadpstudy.behavioral.interpreter.expressions;

import br.com.paulopinheiro.javadpstudy.behavioral.interpreter.Context;

public interface Expression {
    public boolean interpret(Context context);
}
