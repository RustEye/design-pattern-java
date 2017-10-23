package abstractfactorypattern;

/**
 * Created by Meer on 2017/10/20.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw()");
    }
}
