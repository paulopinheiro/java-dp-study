package br.com.paulopinheiro.javadpstudy.structural.flyweight.players;

public class CounterTerrorist implements Player {
    private final String task = "DIFFUSE A BOMB!";
    private String weapon;

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void callMission() {
        System.out.println("Counter terrorist with weapon " + weapon + " | Mission is: " + task);
    }
}
