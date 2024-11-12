package br.com.paulopinheiro.javadpstudy.behavioral.visitor;

import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Book;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Cd;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Dvd;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.elements.Element;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.visitors.SouthAmericaPostageVisitor;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.visitors.UsPostageVisitor;
import br.com.paulopinheiro.javadpstudy.behavioral.visitor.visitors.Visitor;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Element> list = createList();
        Visitor usVisitor = new UsPostageVisitor();
        Visitor saVisitor = new SouthAmericaPostageVisitor();

        System.out.println("The total postage for shipping my items to the US is " + calculatePostage(list,usVisitor));
        System.out.println("The total postage for shipping my items to South America is " + calculatePostage(list,saVisitor));
    }

    private static List<Element> createList() {
        List<Element> list = new ArrayList<>();

        list.add(new Book("Phantom of the Opera",6,10));
        list.add(new Cd("The Dark Side of The Moon",10,5));
        list.add(new Dvd("Ghost",40,8));

        list.add(new Cd("Arrival",15,5));
        list.add(new Cd("Abbey Road",25,5));

        return list;
    }

    private static double calculatePostage(List<Element> list, Visitor visitor) {
        for (Element e:list) e.accept(visitor);

        return visitor.getTotalPostageCost();
    }
}
