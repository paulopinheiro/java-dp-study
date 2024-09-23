package br.com.paulopinheiro.javadpstudy.abstractfactory;

import br.com.paulopinheiro.javadpstudy.abstractfactory.movies.bollywood.BollywoodMovie;
import br.com.paulopinheiro.javadpstudy.abstractfactory.movies.hollywood.HollywoodMovie;

public interface MovieAbstractFactory {
    public HollywoodMovie getHollywoodMovie();
    public BollywoodMovie getBollywoodMovie();
}
