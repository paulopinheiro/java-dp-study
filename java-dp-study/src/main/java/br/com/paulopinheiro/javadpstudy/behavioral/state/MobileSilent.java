package br.com.paulopinheiro.javadpstudy.behavioral.state;

public class MobileSilent implements MobileState {
    @Override
    public void alert() {
        System.out.println("Silent...");
    }
}
