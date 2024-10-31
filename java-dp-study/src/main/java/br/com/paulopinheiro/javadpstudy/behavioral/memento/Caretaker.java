package br.com.paulopinheiro.javadpstudy.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> mementoHistory = new ArrayList<>();

    public void addState(Memento memento) {
        this.mementoHistory.add(memento);
    }

    public void undo(int index) {
        Memento m = mementoHistory.get(index);
        m.restore();
    }
}
