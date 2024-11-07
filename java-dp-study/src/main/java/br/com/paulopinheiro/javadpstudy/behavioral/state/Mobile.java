package br.com.paulopinheiro.javadpstudy.behavioral.state;

public class Mobile {
    private MobileState state;

    public Mobile() {
        this.state = new MobileSilent();
    }

    public void alert() {
        this.state.alert();
    }

    public void setState(MobileState state) {
        this.state = state;
    }
}
