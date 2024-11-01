package br.com.paulopinheiro.javadpstudy.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Subject cricketData = new CricketData();

        Observer currentScore = new CurrentScore();
        Observer averageScore = new AverageScore();

        cricketData.register(currentScore);
        cricketData.register(averageScore);

        cricketData.dataChanged(90, 2, 10);
        cricketData.notifyObservers();
        System.out.println("--------------------------------------\n");

        cricketData.unregister(averageScore);
        cricketData.notifyObservers();
    }
}
