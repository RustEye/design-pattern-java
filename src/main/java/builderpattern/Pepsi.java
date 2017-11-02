package builderpattern;

/**
 * 百事
 *
 * @author Meer
 * @create 2017-10-24 13:28
 **/

public class Pepsi extends SoftDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
