package prototypepattern;

import java.util.Hashtable;

/**
 * 从数据库获取实体类，并把它们存储在一个 Hashtable 中
 *
 * @author Meer
 * @create 2017-10-25 14:09
 **/

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
