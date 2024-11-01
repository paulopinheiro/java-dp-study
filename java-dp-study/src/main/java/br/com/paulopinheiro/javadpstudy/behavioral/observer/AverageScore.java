package br.com.paulopinheiro.javadpstudy.behavioral.observer;

public final class AverageScore implements Observer {
    @Override
    public void update(int runs, int wickets, int overs) {
        double runrate = runs/overs;
        System.out.println("****** Average Score Display ******");
        System.out.println("Run Rate: " + runrate);
        System.out.println("Predicted score: " + runrate*50);
    }
}
