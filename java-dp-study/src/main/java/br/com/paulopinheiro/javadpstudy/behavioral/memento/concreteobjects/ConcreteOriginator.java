package br.com.paulopinheiro.javadpstudy.behavioral.memento.concreteobjects;

import br.com.paulopinheiro.javadpstudy.behavioral.memento.Memento;
import br.com.paulopinheiro.javadpstudy.behavioral.memento.Originator;

public class ConcreteOriginator implements Originator {
    private String name;

    @Override
    public Memento saveState() {
        Memento m = new ConcreteMemento(this, this.name);
        return m;
    }

    public void restoreState(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
        System.out.println("New name set: " + name);
    }
}
