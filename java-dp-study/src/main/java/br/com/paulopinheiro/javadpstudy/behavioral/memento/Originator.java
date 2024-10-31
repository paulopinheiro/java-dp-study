package br.com.paulopinheiro.javadpstudy.behavioral.memento;

public interface Originator {
    public Memento saveState();
    public String getName();
    public void setName(String name);
}
