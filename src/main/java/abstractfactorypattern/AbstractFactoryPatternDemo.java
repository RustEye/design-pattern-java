package abstractfactorypattern;

/**
 * Created by Meer on 2017/10/23.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("square");
        shape.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("red");
        color.fill();
    }
}
