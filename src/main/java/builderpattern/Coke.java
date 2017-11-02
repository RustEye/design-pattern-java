package builderpattern;

/**
 * 可乐
 *
 * @author Meer
 * @create 2017-10-24 13:28
 **/

public class Coke extends SoftDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
