package abstractfactorypattern;

/**
 * Created by Meer on 2017/10/23.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill()");
    }
}
