package br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.handlers;

import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.message.Message;

public class AuthenticationErrorHandler implements Receiver {
    private Receiver nextHandler;

    @Override
    public void processMessage(Message message) {
        System.out.println("Authentication error handler processed " 
                          + message.getPriority().name()
                          + " priority issue: "
                          + message.getText());
    }

    @Override
    public void setNextHandler(Receiver nextHandler) {
        this.nextHandler = nextHandler;
    }
}
