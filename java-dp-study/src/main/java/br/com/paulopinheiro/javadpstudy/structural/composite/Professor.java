package br.com.paulopinheiro.javadpstudy.structural.composite;

public class Professor implements Faculty {
    private final String name;
    private final String title;

    public Professor(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String getDetails() {
        return this.name + ", " + this.title;
    }
    
}
