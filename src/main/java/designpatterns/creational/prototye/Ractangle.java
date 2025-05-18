package designpatterns.creational.prototye;

public class Ractangle extends Shape{

    private int width;
    private int height;

    public Ractangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + this.color + " ractangle with width " + this.width + " and height " + this.height);
    }
}
