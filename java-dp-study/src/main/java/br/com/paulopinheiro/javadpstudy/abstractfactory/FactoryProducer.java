package br.com.paulopinheiro.javadpstudy.abstractfactory;

import java.security.InvalidParameterException;

public class FactoryProducer {
    public static MovieAbstractFactory getMovieFactory(String genre) {
        switch (genre) {
            case "COMEDY" -> {return new ComedyMovieFactory();}
            case "ACTION" -> {return new ActionMovieFactory();}
            default -> throw new InvalidParameterException("Invalid genre");
        }
    }
}
