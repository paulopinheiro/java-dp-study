package br.com.paulopinheiro.javadpstudy.udemy.abstractfactory;

interface HollyWoodMovieInterface {
    String getMovieName();
}

class HollyWoodActionMovie implements HollyWoodMovieInterface {
    @Override
    public String getMovieName()
    {
        return "True Lies is a Hollywood Action Movie";
    }
}

class HollyWoodComedyMovie implements HollyWoodMovieInterface {
    @Override
    public String getMovieName()
    {
        return "The Jerk is a Hollywood Comedy Movie";
    }
}