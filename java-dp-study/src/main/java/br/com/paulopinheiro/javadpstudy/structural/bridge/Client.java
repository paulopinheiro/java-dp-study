package br.com.paulopinheiro.javadpstudy.structural.bridge;

import br.com.paulopinheiro.javadpstudy.structural.bridge.colors.Green;
import br.com.paulopinheiro.javadpstudy.structural.bridge.colors.Red;
import br.com.paulopinheiro.javadpstudy.structural.bridge.shapes.Rectangle;
import br.com.paulopinheiro.javadpstudy.structural.bridge.shapes.Shape;
import br.com.paulopinheiro.javadpstudy.structural.bridge.shapes.Triangle;

public class Client {
    public static void main(String[] args) {
        Shape GreenTriangle = new Triangle(new Green(),20);
        GreenTriangle.drawShape();

        GreenTriangle.modifyBorder(3);
        GreenTriangle.drawShape();

        System.out.println();

        Shape RedRectangle = new Rectangle(new Red(),50);
        RedRectangle.drawShape();

        RedRectangle.modifyBorder(2);
        RedRectangle.drawShape();
    }
}
