package br.com.paulopinheiro.javadpstudy.creational.singleton;

public class CaptainSingleton {
    private CaptainSingleton(){}

    // Bill Pugh method
    private class InnerClass {
        private static final CaptainSingleton uniqueInstance = new CaptainSingleton();
    }

    public static CaptainSingleton getInstance() {
        return InnerClass.uniqueInstance;
    }
}
