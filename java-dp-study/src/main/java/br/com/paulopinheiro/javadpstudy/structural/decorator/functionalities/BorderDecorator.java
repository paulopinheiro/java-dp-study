package br.com.paulopinheiro.javadpstudy.structural.decorator.functionalities;

import br.com.paulopinheiro.javadpstudy.structural.decorator.shapes.Shape;

public class BorderDecorator extends ShapeDecorator {
    private final String border;

    public BorderDecorator(Shape shape, String border) {
        super(shape);
        this.border = border;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("It's going to have " + border);
    }
}
