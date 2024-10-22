package br.com.paulopinheiro.javadpstudy.structural.decorator;

import br.com.paulopinheiro.javadpstudy.structural.decorator.functionalities.BorderDecorator;
import br.com.paulopinheiro.javadpstudy.structural.decorator.functionalities.ColorDecorator;
import br.com.paulopinheiro.javadpstudy.structural.decorator.functionalities.ShapeDecorator;
import br.com.paulopinheiro.javadpstudy.structural.decorator.shapes.Circle;
import br.com.paulopinheiro.javadpstudy.structural.decorator.shapes.Rectangle;
import br.com.paulopinheiro.javadpstudy.structural.decorator.shapes.Shape;

public class Client {
    public static void main (String args[]) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        ShapeDecorator redRectangle = new ColorDecorator(rectangle,"red");
        redRectangle.draw();
        System.out.println("\n---------------------------------------------------------\n");
        
        ShapeDecorator dottedRedRectangle = new BorderDecorator(redRectangle,"Dotted border");
        dottedRedRectangle.draw();
        System.out.println("\n---------------------------------------------------------\n");

        ShapeDecorator blueCircle = new ColorDecorator(circle,"Blue");
        blueCircle.draw();
        System.out.println("\n---------------------------------------------------------\n");

        ShapeDecorator solidBlueCircle = new BorderDecorator(blueCircle,"Solid border");
        solidBlueCircle.draw();
        System.out.println("\n---------------------------------------------------------\n");

        ShapeDecorator solidCircle = new BorderDecorator(circle,"Solid border");
        solidCircle.draw();
    }
}
