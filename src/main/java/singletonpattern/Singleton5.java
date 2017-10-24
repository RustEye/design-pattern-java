package singletonpattern;

/**
 * 登记式/静态内部类
 *
 * @author Meer
 * @create 2017-10-24 10:32
 **/

public class Singleton5 {
    private Singleton5(){};

    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
