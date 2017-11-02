package singletonpattern;

/**
 * 双检锁,要注意volatile关键字
 * 这里不加volatile的话本身代码是没有问题的，但是在多线程环境下
 * 有时会发生指令重排序，new 对象的时候，设置instance指向内存空间在初始化对象之前
 * 这样就会导致，可能会取到空的对象，而volatile关键字能禁止指令重排序。
 *
 * @author Meer
 * @create 2017-10-24 10:24
 **/

public class Singleton4 {
    private static volatile Singleton4 instance;

    private Singleton4(){};

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
