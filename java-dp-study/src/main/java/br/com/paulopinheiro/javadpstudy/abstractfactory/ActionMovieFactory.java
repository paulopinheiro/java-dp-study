package br.com.paulopinheiro.javadpstudy.abstractfactory;

import br.com.paulopinheiro.javadpstudy.abstractfactory.movies.bollywood.BollywoodActionMovie;
import br.com.paulopinheiro.javadpstudy.abstractfactory.movies.bollywood.BollywoodMovie;
import br.com.paulopinheiro.javadpstudy.abstractfactory.movies.hollywood.HollywoodActionMovie;
import br.com.paulopinheiro.javadpstudy.abstractfactory.movies.hollywood.HollywoodMovie;

public class ActionMovieFactory implements MovieAbstractFactory {
    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }
    @Override
    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }    
}
