package br.com.paulopinheiro.java.dp.study.udemy.factory.abstractcreator;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }

    // other helper methods
}

class RectangleFactory extends AbstractShapeFactory
{
    @Override
    protected Shape factoryMethod()
    {
        return new Rectangle();
    }
}
class SquareFactory extends AbstractShapeFactory
{
    protected Shape factoryMethod()
    {
        return new Square();
    }
}

class CircleFactory extends AbstractShapeFactory
{
    @Override
    protected Shape factoryMethod()
    {
        return new Circle();
    }
}