package br.com.paulopinheiro.javadpstudy.structural.facade;

public class Client {
    public static void main(String args[]) {
        HotelKeeperFacade hotelKeeper = new HotelKeeperFacade();

        hotelKeeper.getVegMenu().showMenu();
        hotelKeeper.getNonVegMenu().showMenu();
        hotelKeeper.getBothMenu().showMenu();
    }
}
