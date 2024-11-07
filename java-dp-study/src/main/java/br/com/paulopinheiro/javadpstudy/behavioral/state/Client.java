package br.com.paulopinheiro.javadpstudy.behavioral.state;

public class Client {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.setState(new MobileVibrating());
        mobile.alert();
        mobile.alert();
        mobile.setState(new MobileSilent());
        mobile.alert();
        mobile.alert();
        mobile.alert();
    }
}
