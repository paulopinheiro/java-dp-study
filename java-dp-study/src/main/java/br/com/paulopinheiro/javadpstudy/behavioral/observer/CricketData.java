package br.com.paulopinheiro.javadpstudy.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {
    private final List<Observer> observersList;

    private int runs;
    private int wickets;
    private int overs;

    public CricketData() {
        this.observersList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (!this.observersList.contains(observer))
            this.observersList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        if (this.observersList.contains(observer))
            this.observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:this.observersList) {
            o.update(this.runs, this.wickets, this.overs);
        }
    }

    @Override
    public void dataChanged(int runs, int wickets, int overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }
}
