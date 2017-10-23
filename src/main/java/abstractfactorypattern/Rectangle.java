package abstractfactorypattern;

/**
 * Created by Meer on 2017/10/20.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw()");
    }
}
