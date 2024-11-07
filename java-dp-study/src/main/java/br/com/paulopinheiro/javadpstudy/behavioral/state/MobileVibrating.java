package br.com.paulopinheiro.javadpstudy.behavioral.state;

public class MobileVibrating implements MobileState {
    @Override
    public void alert() {
        System.out.println("Vibrating...");
    }
}
