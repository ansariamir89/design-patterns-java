package designpatterns.creational.factory;

import java.awt.*;

public class TestFactoryPattern {

    public static void main(String[] args) {


        Circle circle = (Circle)ShapeFactory.getShape(ShapeEnum.CIRCLE);
        circle.setRadius(7);
        circle.draw();

        Rectangle rectangle = (Rectangle) ShapeFactory.getShape(ShapeEnum.RECTANGLE);
        rectangle.setWidth(3);
        rectangle.setHeight(4);
        rectangle.draw();
    }
}
