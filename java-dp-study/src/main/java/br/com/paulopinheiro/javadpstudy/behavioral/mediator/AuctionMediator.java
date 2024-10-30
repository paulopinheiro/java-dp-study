package br.com.paulopinheiro.javadpstudy.behavioral.mediator;

public interface AuctionMediator {
    public void addBuyer(BuyerColleague buyer);
    public void endAuction();
    public BuyerColleague getWinner();
    public void sendMessage(String msg, Buyer buyer);
}
