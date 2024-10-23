package br.com.paulopinheiro.javadpstudy.structural.proxy;

public class Client {
    private static final Gateway proxy = new GatewayProxy();

    public static void main(String[] args) {
        tryToConnect("www.google.com");
        tryToConnect("www.donotenter.com");
        tryToConnect("www.msn.com");
        tryToConnect("www.deepdanger.com");
    }

    private static void tryToConnect(String hostname) {
        try {
            proxy.connectTo(hostname);
        } catch (SecurityException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("\n--------------------------------------\n");
        }
    }
}
