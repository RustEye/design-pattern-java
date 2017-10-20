package factorypattern;

/**
 * Created by Meer on 2017/10/20.
 */
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");

        circle.draw();

        Shape square = shapeFactory.getShape("square");

        square.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");

        rectangle.draw();
    }
}
