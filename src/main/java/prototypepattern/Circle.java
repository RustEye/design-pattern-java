package prototypepattern;

/**
 * 继承Shape的实体类
 *
 * @author Meer
 * @create 2017-10-25 14:03
 **/

public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    public  void draw(){
        System.out.println("\"Inside Circle::draw()");
    }
}
