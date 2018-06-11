package mementopattern;

/**
 * @author Meer
 * @create 2018-06-11 21:05
 **/

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
