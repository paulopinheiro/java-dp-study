package br.com.paulopinheiro.javadpstudy.udemy.adapter.objectcomposition.example1;

interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I am flying a short distance");
    }
}