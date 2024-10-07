package br.com.paulopinheiro.javadpstudy.creational.abstractfactory;

import br.com.paulopinheiro.javadpstudy.creational.abstractfactory.movies.bollywood.BollywoodMovie;
import br.com.paulopinheiro.javadpstudy.creational.abstractfactory.movies.hollywood.HollywoodMovie;

public interface MovieAbstractFactory {
    public HollywoodMovie getHollywoodMovie();
    public BollywoodMovie getBollywoodMovie();
}
