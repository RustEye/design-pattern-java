package templatepattern;

/**
 * @author Meer
 * @create 2018-06-07 21:41
 **/

public class Football extends Game{

    @Override
    void init() {
        System.out.println("Football Game init");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game start");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game end");
    }
}
