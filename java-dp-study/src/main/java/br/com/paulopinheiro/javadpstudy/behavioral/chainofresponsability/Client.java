package br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability;

import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.handlers.AuthenticationErrorHandler;
import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.handlers.EmailErrorHandler;
import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.handlers.FaxErrorHandler;
import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.message.Message;
import br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.message.MessagePriority;

public class Client {
    public static void main(String args[]) {
        AuthenticationErrorHandler authEH = new AuthenticationErrorHandler();
        EmailErrorHandler emailEH = new EmailErrorHandler();
        FaxErrorHandler faxEH = new FaxErrorHandler();

        //Bulding the Chain of Responsability
        IssueRaiser ih = new IssueRaiser(faxEH);
        faxEH.setNextHandler(emailEH);
        emailEH.setNextHandler(authEH);

        ih.raiseMessage(new Message(MessagePriority.HIGH,"Security violation"));
        ih.raiseMessage(new Message(MessagePriority.NORMAL,"Paper jam in FAX machine"));
        ih.raiseMessage(new Message(MessagePriority.NORMAL,"Invalid user"));
        ih.raiseMessage(new Message(MessagePriority.HIGH,"Email password leaked"));
    }
}
