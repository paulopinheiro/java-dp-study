package br.com.paulopinheiro.javadpstudy.behavioral.memento;

import br.com.paulopinheiro.javadpstudy.behavioral.memento.concreteobjects.ConcreteOriginator;

public class Client {
    public static void main(String[] args) {
        Caretaker ct = new Caretaker();
        Originator orig = new ConcreteOriginator();

        orig.setName("Originator #0");
        ct.addState(orig.saveState());

        orig.setName("Originator #1");
        ct.addState(orig.saveState());

        orig.setName("Originator #2");
        ct.addState(orig.saveState());

        orig.setName("Originator #3");
        ct.addState(orig.saveState());

        System.out.println("Undoing to state 1");
        ct.undo(1);
    }
}
