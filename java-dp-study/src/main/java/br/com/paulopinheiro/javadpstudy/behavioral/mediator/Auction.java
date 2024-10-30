package br.com.paulopinheiro.javadpstudy.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
    private final List<BuyerColleague> buyers = new ArrayList<>();

    @Override
    public void addBuyer(BuyerColleague buyer) {
        this.buyers.add(buyer);
    }

    @Override
    public void endAuction() {
        BuyerColleague winner = this.getWinner();

        for (BuyerColleague b:buyers) {
            b.receiveMessage("The auction is over. The winner is " + winner.getName() + ", with offer $" + String.valueOf(winner.getPrice()));
        }
        System.out.println();
    }

    @Override
    public BuyerColleague getWinner() {
        int biggestOffer = 0;
        BuyerColleague winner = null;
        for (BuyerColleague b:this.buyers) {
            if (b.getPrice() > biggestOffer) {
                biggestOffer = b.getPrice();
                winner = b;
            }
        }
        return winner;
    }

    @Override
    public void sendMessage(String msg, Buyer buyer) {
        for (BuyerColleague b:buyers) {
            if (b!=buyer) b.receiveMessage(msg);
        }
        System.out.println();
    }
    
}
