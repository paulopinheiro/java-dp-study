package br.com.paulopinheiro.javadpstudy.behavioral.mediator;

public class Client {
    private static AuctionMediator auction = new Auction();
    public static void main(String[] args) {
        Buyer john = new Buyer("John",auction);
        addUser(john);

        Buyer paul = new Buyer("Paul",auction);
        addUser(paul);

        Buyer george = new Buyer("George",auction);
        addUser(george);

        Buyer ringo = new Buyer("Ringo",auction);
        addUser(ringo);

        System.out.println("\n----------- Starting the auction");

        bidValue(john,2000);
        bidValue(paul,2500);
        bidValue(john,3500);
        bidValue(ringo,4000);
        bidValue(george,6000);
        cancelBid(ringo);

        finishAuction();
        cancelBid(george);
        finishAuction();
    }

    private static void addUser(Buyer b) {
        System.out.println("----------- " + "Adding new buyer: " + b.getName());
        auction.addBuyer(b);
    }

    private static void bidValue(Buyer b, int value) {
        System.out.println("----------- " + b.getName() + " bids $" + String.valueOf(value));
        b.placeBid(value);
    }

    private static void cancelBid(Buyer b) {
        System.out.println("----------- " + b.getName() + " cancels the bid");
        b.cancelBid();
    }

    private static void finishAuction() {
        System.out.println("----------- Ending the auction");
        auction.endAuction();
    }
}
