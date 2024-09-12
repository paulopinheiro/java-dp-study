package br.com.paulopinheiro.java.dp.study.factory;

import br.com.paulopinheiro.java.dp.study.factory.animals.Animal;

public class FactoryClient {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal duck = factory.getAnimal(AnimalFactory.DUCK);
        Animal tiger = factory.getAnimal(AnimalFactory.TIGER);

        System.out.print("The duck says "); duck.talk();
        System.out.print(" and the tiger says "); tiger.talk();
        System.out.println();
    }
}
