package builderpattern;

/**
 * 实现packing接口的实体类
 *
 * @author Meer
 * @create 2017-10-24 13:18
 **/

public class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}
