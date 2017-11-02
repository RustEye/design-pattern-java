package builderpattern;

/**
 * Item接口实现类
 *
 * @author Meer
 * @create 2017-10-24 13:22
 **/

public abstract class SoftDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
