package br.com.paulopinheiro.javadpstudy.behavioral.visitor.visitors;

import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Book;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Cd;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Dvd;

public interface Visitor {
    public void visit(Book book);
    public void visit(Cd cd);
    public void visit(Dvd dvd);
    public double getTotalPostageCost();
}
