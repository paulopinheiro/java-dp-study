package br.com.paulopinheiro.javadpstudy.structural.flyweight.players;

public class Terrorist implements Player {
    private final String task = "PLANT A BOMB!";
    private String weapon;

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void callMission() {
        System.out.println("Terrorist with weapon " + weapon + " | Mission is: " + task);
    }
}
