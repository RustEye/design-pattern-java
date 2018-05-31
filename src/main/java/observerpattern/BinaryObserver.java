package observerpattern;

/**
 * 观察者
 *
 * @author Meer
 * @create 2018-05-31 23:02
 **/

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
    }
}
