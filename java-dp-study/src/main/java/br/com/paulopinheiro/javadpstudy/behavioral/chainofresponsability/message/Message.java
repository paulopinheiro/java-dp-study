package br.com.paulopinheiro.javadpstudy.behavioral.chainofresponsability.message;

public class Message {
    private final MessagePriority priority;
    private final String text;

    public Message(MessagePriority priority, String text) {
        this.priority = priority;
        this.text = text;
    }

    /**
     * @return the priority
     */
    public MessagePriority getPriority() {
        return priority;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }
}
