package br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.handlers;

import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.message.Message;

public class EmailErrorHandler implements Receiver {
    private Receiver nextHandler;

    @Override
    public void processMessage(Message message) {
        if (this.nextHandler==null) throw new NullPointerException("No next handler set for EmailErrorHandler");

        if (message.getText().toLowerCase().contains("email")) {
            System.out.println("Email error handler processed " 
                              + message.getPriority().name()
                              + " priority issue: "
                              + message.getText());
        } else {
            nextHandler.processMessage(message);
        }
    }

    @Override
    public void setNextHandler(Receiver nextHandler) {
        this.nextHandler = nextHandler;
    }
}
