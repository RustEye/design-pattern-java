package builderpattern;

/**
 * Item接口实现类
 *
 * @author Meer
 * @create 2017-10-24 13:22
 **/

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
