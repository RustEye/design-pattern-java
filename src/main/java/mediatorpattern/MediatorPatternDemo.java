package mediatorpattern;

/**
 * @author Meer
 * @create 2018-06-06 21:26
 **/

public class MediatorPatternDemo {
    public static void main(String[] args){
        User andy = new User("Andy");
        User john = new User("John");

        andy.sendMessage("Hi! John");
        john.sendMessage("Hello! Andy");
    }
}
