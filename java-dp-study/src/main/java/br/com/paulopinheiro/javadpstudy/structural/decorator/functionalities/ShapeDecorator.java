package br.com.paulopinheiro.javadpstudy.structural.decorator.functionalities;

import br.com.paulopinheiro.javadpstudy.structural.decorator.shapes.Shape;

public class ShapeDecorator extends Shape {
    private final Shape shape;

    protected ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        if (shape!=null) {
            shape.draw();
        }
    }
}
