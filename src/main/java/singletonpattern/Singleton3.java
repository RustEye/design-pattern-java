package singletonpattern;

/**
 * 饿汉式
 *
 * @author Meer
 * @create 2017-10-24 10:20
 **/

public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3(){};

    public static Singleton3 getInstance(){
        return instance;
    }
}
