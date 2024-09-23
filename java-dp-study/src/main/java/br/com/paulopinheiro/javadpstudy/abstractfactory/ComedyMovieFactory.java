package br.com.paulopinheiro.javadpstudy.abstractfactory;

import br.com.paulopinheiro.javadpstudy.abstractfactory.movies.bollywood.BollywoodComedyMovie;
import br.com.paulopinheiro.javadpstudy.abstractfactory.movies.bollywood.BollywoodMovie;
import br.com.paulopinheiro.javadpstudy.abstractfactory.movies.hollywood.HollywoodComedyMovie;
import br.com.paulopinheiro.javadpstudy.abstractfactory.movies.hollywood.HollywoodMovie;

public class ComedyMovieFactory implements MovieAbstractFactory {
    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
