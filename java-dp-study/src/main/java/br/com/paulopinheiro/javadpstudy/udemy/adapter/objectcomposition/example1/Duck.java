package br.com.paulopinheiro.javadpstudy.udemy.adapter.objectcomposition.example1;

interface Duck {
    public void quack();
    public void fly();
}

class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I am flying");
    }
}