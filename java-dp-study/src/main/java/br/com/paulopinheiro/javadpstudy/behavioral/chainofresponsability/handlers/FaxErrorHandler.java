package br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.handlers;

import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.message.Message;

public class FaxErrorHandler implements Receiver {
    private Receiver nextHandler;

    @Override
    public void processMessage(Message message) {
        if (this.nextHandler==null) throw new NullPointerException("No next handler set for FaxErrorHandler");

        if (message.getText().toLowerCase().contains("fax")) {
            System.out.println("Fax error handler processed " 
                              + message.getPriority().name()
                              + " priority issue: "
                              + message.getText());
        } else {
            nextHandler.processMessage(message);
        }
    }

    /**
     * @param nextHandler the nextHandler to set
     */
    @Override
    public void setNextHandler(Receiver nextHandler) {
        this.nextHandler = nextHandler;
    }
}
