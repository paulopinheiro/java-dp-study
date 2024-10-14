package br.com.paulopinheiro.javadpstudy.creational.prototype.cars;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class BasicCar implements Cloneable {
    protected int id;
    protected String name;
    protected float price = (float)30000;
    protected String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(BasicCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clone;
    }

    @Override
    public String toString() {
        return "The car is " + this.getColor() + " " + this.getName() + " and the price is " + String.valueOf(this.getPrice());
    }
}
