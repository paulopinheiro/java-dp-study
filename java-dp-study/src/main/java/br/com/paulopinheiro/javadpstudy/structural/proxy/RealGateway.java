package br.com.paulopinheiro.javadpstudy.structural.proxy;

public class RealGateway implements Gateway {
    
    @Override
    public void connectTo(String hostname) {
        System.out.println("Connecting to " + hostname + "...");
        System.out.println("Successfully connected to " + hostname + "!");
    }
}
