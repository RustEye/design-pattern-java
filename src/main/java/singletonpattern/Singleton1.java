package singletonpattern;

/**
 * 懒汉式，线程不安全
 *
 * @author Meer
 * @create 2017-10-24 10:10
 **/

public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){};

    public static Singleton1 getInstance() {
        if(instance == null){
            instance = new Singleton1();
        }
        return  instance;
    }
}
