package designpatterns.creational.factory;

public abstract class ShapeFactory {


    public static Shape getShape(ShapeEnum shape){

        if(null == shape){
            return null;
        }
        return switch (shape){
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
        };
    }
}
