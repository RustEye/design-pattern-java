package builderpattern;

/**
 * 蔬菜汉堡
 *
 * @author Meer
 * @create 2017-10-24 13:25
 **/

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
