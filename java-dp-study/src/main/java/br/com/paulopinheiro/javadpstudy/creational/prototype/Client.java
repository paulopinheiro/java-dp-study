package br.com.paulopinheiro.javadpstudy.creational.prototype;

public class Client {
    public static void main(String[] args) {
        BasicCarCache.loadCache();

        for (int i=1;i<4;i++) {
            System.out.println(BasicCarCache.getCar(i));
        }
    }
}
