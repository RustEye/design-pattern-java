package templatepattern;

/**
 * @author Meer
 * @create 2018-06-07 21:39
 **/

public abstract class Game {
    abstract void init();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        init();

        startPlay();

        endPlay();
    }
}
