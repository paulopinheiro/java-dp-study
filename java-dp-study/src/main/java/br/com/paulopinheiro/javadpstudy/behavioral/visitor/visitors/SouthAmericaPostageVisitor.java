package br.com.paulopinheiro.javadpstudy.behavioral.visitor.visitors;

import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Book;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Cd;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Dvd;

public class SouthAmericaPostageVisitor implements Visitor {
    private double totalPostageCost = 0;

    @Override
    public void visit(Book book) {
        if (book.getPrice()<=30)
            totalPostageCost = totalPostageCost + (book.getWeight() * 4);
    }

    @Override
    public void visit(Cd cd) {
        if (cd.getPrice()<=30)
            totalPostageCost = totalPostageCost + (cd.getWeight() * 5);
    }

    @Override
    public void visit(Dvd dvd) {
        if (dvd.getPrice()<=30)
            totalPostageCost = totalPostageCost + (dvd.getWeight() * 6);
    }

    @Override
    public double getTotalPostageCost() {
        return totalPostageCost;
    }
}
