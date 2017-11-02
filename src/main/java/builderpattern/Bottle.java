package builderpattern;

/**
 * Packing接口实现类
 *
 * @author Meer
 * @create 2017-10-24 13:20
 **/

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
