package br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability;

import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.handlers.Receiver;
import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.message.Message;

public class IssueRaiser {
    private final Receiver receiver;

    public IssueRaiser(Receiver receiver) {
        this.receiver = receiver;
    }

    public void raiseMessage(Message message) {
        receiver.processMessage(message);
    }
}
