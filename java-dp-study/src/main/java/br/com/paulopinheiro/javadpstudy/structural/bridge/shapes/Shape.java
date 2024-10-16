package br.com.paulopinheiro.javadpstudy.structural.bridge.shapes;

import br.com.paulopinheiro.javadpstudy.structural.bridge.colors.Color;

public abstract class Shape {
    protected final Color color;
    protected int border;
    protected String shapeName;

    protected Shape(Color color, int border, String shapeName) {
        this.color = color;
        this.shapeName = shapeName;
        this.border = border;
    }

    public void modifyBorder(int increment) {
        this.border = border * increment;
        System.out.println("Now we are changing the triangle border length "+ increment + " times");
    }

    public void drawShape() {
        System.out.print("This " + shapeName + " is colored with ");
        color.fillWithColor(border);
    }
}
