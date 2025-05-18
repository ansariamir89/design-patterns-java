package designpatterns.creational.prototye;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Circle circle = new Circle("RED", 7);
        Circle circle1 = (Circle) circle.clone();

        circle.draw();
        circle1.draw();
        System.out.println(circle.hashCode());
        System.out.println(circle1.hashCode());

        System.out.println(circle.equals(circle1));

        Ractangle ractangle = new Ractangle("GREEN", 5, 3);
        Ractangle ractangle1 = (Ractangle) ractangle.clone();

        ractangle.draw();
        ractangle1.draw();
        System.out.println(ractangle.hashCode());
        System.out.println(ractangle1.hashCode());

        System.out.println(ractangle.equals(ractangle1));
    }
}
