package br.com.paulopinheiro.javadpstudy.behavioral.mediator;

public interface BuyerColleague {
    public void placeBid(int value);
    public void cancelBid();
    public void receiveMessage(String msg);
    public String getName();
    public int getPrice();
}
