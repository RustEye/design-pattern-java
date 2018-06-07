package templatepattern;

/**
 * @author Meer
 * @create 2018-06-07 21:41
 **/

public class Cricket extends Game{

    @Override
    void init() {
        System.out.println("Cricket Game init");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game start");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game end");
    }
}
