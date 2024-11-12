package br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements;

import br.com.paulopinheiro.javadpstudy.behavioral.visitor.visitors.Visitor;

public interface Element {
    public void accept(Visitor visitor);
}
