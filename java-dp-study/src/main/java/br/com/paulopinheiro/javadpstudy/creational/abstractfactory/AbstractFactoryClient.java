package br.com.paulopinheiro.javadpstudy.creational.abstractfactory;

public class AbstractFactoryClient {
    public static void main(String args[]) {
        MovieAbstractFactory comedyFactory = FactoryProducer.getMovieFactory("COMEDY");
        MovieAbstractFactory actionFactory = FactoryProducer.getMovieFactory("ACTION");

        System.out.println(comedyFactory.getBollywoodMovie().getMovieName());
        System.out.println(comedyFactory.getHollywoodMovie().getMovieName());
        System.out.println();
        System.out.println(actionFactory.getBollywoodMovie().getMovieName());
        System.out.println(actionFactory.getHollywoodMovie().getMovieName());
    }
}
