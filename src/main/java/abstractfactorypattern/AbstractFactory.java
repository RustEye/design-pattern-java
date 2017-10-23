package abstractfactorypattern;

/**
 * Created by Meer on 2017/10/23.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
