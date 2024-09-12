package br.com.paulopinheiro.java.dp.study.factory;

import br.com.paulopinheiro.java.dp.study.factory.animals.Animal;
import br.com.paulopinheiro.java.dp.study.factory.animals.Duck;
import br.com.paulopinheiro.java.dp.study.factory.animals.Tiger;
import java.security.InvalidParameterException;

public class AnimalFactory {
    public static final int DUCK = 0;
    public static final int TIGER = 1;

    public Animal getAnimal(int animalType) {
        switch (animalType) {
            case DUCK -> {return new Duck();}
            case TIGER -> {return new Tiger();}
            default -> throw new InvalidParameterException("Unknow animal");                
        }
    }
}
