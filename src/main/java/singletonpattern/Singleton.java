package singletonpattern;

/**
 * 使用枚举类的方式实现单例
 *
 * @author Meer
 * @create 2017-10-24 10:10
 **/

public enum Singleton {
    INSTANCE;
    public void test(){
        System.out.println("The best Singleton.");
    }
}
