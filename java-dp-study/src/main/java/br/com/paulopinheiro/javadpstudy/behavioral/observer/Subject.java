package br.com.paulopinheiro.javadpstudy.behavioral.observer;

public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObservers();

    // Not part of the pattern. Just to simulate changes in data
    public void dataChanged(int runs, int wickets, int overs);
}
