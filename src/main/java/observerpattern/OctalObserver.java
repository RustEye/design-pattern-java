package observerpattern;

/**
 * 观察者
 *
 * @author Meer
 * @create 2018-05-31 23:02
 **/

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "+Integer.toOctalString(subject.getState()));
    }
}
