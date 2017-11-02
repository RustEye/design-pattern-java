package builderpattern;

/**
 * 鸡肉汉堡
 *
 * @author Meer
 * @create 2017-10-24 13:25
 **/

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
