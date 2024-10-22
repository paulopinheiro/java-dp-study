package br.com.paulopinheiro.javadpstudy.structural.flyweight;

import br.com.paulopinheiro.javadpstudy.structural.flyweight.players.PlayerFactory;
import br.com.paulopinheiro.javadpstudy.structural.flyweight.players.Player;

public class Client {
    public static void main(String args[]) {
        Player t1 = PlayerFactory.getPlayer("terrorist");
        Player t2 = PlayerFactory.getPlayer("terrorist");
        Player t3 = PlayerFactory.getPlayer("terrorist");

        Player ct1 = PlayerFactory.getPlayer("counter-terrorist");
        Player ct2 = PlayerFactory.getPlayer("counter-terrorist");
        Player ct3 = PlayerFactory.getPlayer("counter-terrorist");

        t1.assignWeapon("Knife");
        t1.callMission();

        t2.assignWeapon("Gun");
        t2.callMission();

        t3.assignWeapon("AR-15");
        t2.callMission();

        ct1.assignWeapon("AR-15");
        ct1.callMission();

        ct2.assignWeapon("Bazooka");
        ct2.callMission();

        ct3.assignWeapon("Knife");
        ct2.callMission();
    }
}
