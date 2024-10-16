package br.com.paulopinheiro.javadpstudy.structural.bridge.colors;

public abstract class Color {
    protected String colorName;

    protected Color(String colorName) {
        this.colorName = colorName;
    }

    public void fillWithColor(int border) {
        System.out.println(colorName + " with " + border + " inches border");
    }
}
