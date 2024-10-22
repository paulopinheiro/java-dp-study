package br.com.paulopinheiro.javadpstudy.structural.decorator.functionalities;

import br.com.paulopinheiro.javadpstudy.structural.decorator.shapes.Shape;

public class ColorDecorator extends ShapeDecorator {
    private final String color;

    public ColorDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Do you want colorful shapes?");
        super.draw();
        System.out.println("We'll paint it " + color);
    }
}
