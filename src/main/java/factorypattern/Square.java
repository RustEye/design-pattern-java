package factorypattern;

/**
 * Created by Meer on 2017/10/20.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw()");
    }
}
