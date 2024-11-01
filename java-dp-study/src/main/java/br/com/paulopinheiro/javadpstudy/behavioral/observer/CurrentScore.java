package br.com.paulopinheiro.javadpstudy.behavioral.observer;

public final class CurrentScore implements Observer {
    @Override
    public void update(int runs, int wickets, int overs) {
        System.out.println("****** Current Score Display ******");
        System.out.println("Runs: " + String.valueOf(runs));
        System.out.println("Wickets: " + String.valueOf(wickets));
        System.out.println("Overs: " + overs);
    }
}
