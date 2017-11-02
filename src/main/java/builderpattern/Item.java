package builderpattern;

/**
 * 食物条目接口
 *
 * @author Meer
 * @create 2017-10-24 10:10
 **/

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
