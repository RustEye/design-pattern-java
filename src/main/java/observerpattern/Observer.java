package observerpattern;

/**
 * 被观察者
 *
 * @author Meer
 * @create 2018-05-31 22:52
 **/

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
