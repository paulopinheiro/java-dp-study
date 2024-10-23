package br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.handlers;

import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.message.Message;

public interface Receiver {
    public void setNextHandler(Receiver nextHandler);
    public void processMessage(Message message);
}
