package br.com.paulopinheiro.javadpstudy.creational.singleton;

public class CaptainTester {
    public static void main(String[] args) {
        System.out.println("Trying to make a captain for our team!");
        CaptainSingleton c1 = CaptainSingleton.getInstance();
        if (c1!=null) System.out.println("New Captain selected for our team.");
        System.out.println();
        System.out.println("Trying to make another captain for our team!");
        CaptainSingleton c2 = CaptainSingleton.getInstance();
        if (c1 == c2) {
            System.out.println("You already have a Captain for your team. Send him for the toss");
            System.out.println("c1 and c2 are the same");
        }
    }
}
