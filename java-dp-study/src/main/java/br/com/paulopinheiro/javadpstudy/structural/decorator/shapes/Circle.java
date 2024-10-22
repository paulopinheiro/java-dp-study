package br.com.paulopinheiro.javadpstudy.structural.decorator.shapes;

public class Circle extends Shape {
    @Override
    public void draw() {
        super.draw();
        System.out.println("This is a circle");
    }
    
}
