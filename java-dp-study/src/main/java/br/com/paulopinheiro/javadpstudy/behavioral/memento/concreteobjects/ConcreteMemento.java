package br.com.paulopinheiro.javadpstudy.behavioral.memento.concreteobjects;

import br.com.paulopinheiro.javadpstudy.behavioral.memento.Memento;
import br.com.paulopinheiro.javadpstudy.behavioral.memento.Originator;

final class ConcreteMemento implements Memento {

    private final ConcreteOriginator originator;
    private final String name;

    public ConcreteMemento(Originator originator, String name) {
        this.originator = (ConcreteOriginator) originator;
        this.name = name;
    }

    @Override
    public void restore() {
        this.originator.restoreState(this.name);
    }
}
