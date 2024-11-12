package br.com.paulopinheiro.javadpstudy.behavioral.visitor.visitors;

import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Book;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Cd;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Dvd;

public class UsPostageVisitor implements Visitor {
    private double totalPostageCost = 0;

    @Override
    public void visit(Book book) {
        if (book.getPrice()<=20)
            totalPostageCost = totalPostageCost + (book.getWeight() * 2);
    }

    @Override
    public void visit(Cd cd) {
        if (cd.getPrice()<=20)
            totalPostageCost = totalPostageCost + (cd.getWeight() * 2.5);
    }

    @Override
    public void visit(Dvd dvd) {
        if (dvd.getPrice()<=20)
            totalPostageCost = totalPostageCost + (dvd.getWeight() * 3);
    }

    @Override
    public double getTotalPostageCost() {
        return this.totalPostageCost;
    }
}
