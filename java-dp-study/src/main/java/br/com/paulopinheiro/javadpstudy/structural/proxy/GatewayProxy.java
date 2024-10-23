package br.com.paulopinheiro.javadpstudy.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class GatewayProxy implements Gateway {
    private static final List<String> BLACKLIST = Arrays.asList("www.deepdanger.com","www.donotenter.com");
    private final RealGateway realGateway;

    public GatewayProxy() {
        this.realGateway = new RealGateway();
    }

    @Override
    public void connectTo(String hostname) {
        System.out.println("Analyzing connection request to " + hostname + ".");
        if (BLACKLIST.contains(hostname)) throw new SecurityException("Access denied. " + hostname + " is blacklisted.");
        realGateway.connectTo(hostname);
    }
}
