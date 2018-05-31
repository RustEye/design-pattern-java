package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 绑定观察者到client对象和从client对象解绑观察者的方法
 *
 * @author Meer
 * @create 2018-05-31 22:49
 **/

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }

}
