package br.com.paulopinheiro.javadpstudy.behavioral.mediator;

public class Buyer implements BuyerColleague {
    private final String name;
    private int price;

    private final AuctionMediator auction;

    public Buyer(String name, AuctionMediator auction) {
        this.name = name;
        this.auction = auction;
        this.price = 0;
    }

    @Override
    public void placeBid(int value) {
        this.price = value;
        this.auction.sendMessage(this.getName() + " has just placed a bid in the value of $" + String.valueOf(this.getPrice()), this);
    }

    @Override
    public void cancelBid() {
        this.price = 0;
        this.auction.sendMessage(this.getName() + " has just canceled the bid",this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(this.name + " received the message: " + msg);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
