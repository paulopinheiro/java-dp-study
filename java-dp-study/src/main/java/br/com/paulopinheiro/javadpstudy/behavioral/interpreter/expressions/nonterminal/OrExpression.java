package br.com.paulopinheiro.javadpstudy.behavioral.interpreter.expressions.nonterminal;

import br.com.paulopinheiro.javadpstudy.behavioral.interpreter.Context;
import br.com.paulopinheiro.javadpstudy.behavioral.interpreter.expressions.Expression;

public class OrExpression implements Expression {
    private final Expression expression1;
    private final Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(Context context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
