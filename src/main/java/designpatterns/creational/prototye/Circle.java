package designpatterns.creational.prototye;

public class Circle extends Shape{

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + this.color + " circle with radius " + this.radius);
    }
}
