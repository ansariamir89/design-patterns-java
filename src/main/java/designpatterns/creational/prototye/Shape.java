package designpatterns.creational.prototye;

public abstract class Shape implements Cloneable {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return (Shape)super.clone();
    }

    public abstract void draw();

}
