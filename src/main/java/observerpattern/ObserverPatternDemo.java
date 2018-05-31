package observerpattern;

/**
 * demo
 *
 * @author Meer
 * @create 2018-05-31 23:05
 **/

public class ObserverPatternDemo {
    public static void main(String[] args){
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("1515151515");
        subject.setState(15);
        System.out.println("1616161616");
        subject.setState(16);
    }
}
