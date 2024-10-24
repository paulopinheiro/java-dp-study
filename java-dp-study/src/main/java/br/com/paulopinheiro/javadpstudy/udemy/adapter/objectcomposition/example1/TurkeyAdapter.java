package br.com.paulopinheiro.javadpstudy.udemy.adapter.objectcomposition.example1;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for(int i = 0; i < 5; i++)
            turkey.fly();
    }
}
