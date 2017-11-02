package prototypepattern;

/**
 * 继承Shape的实体类
 *
 * @author Meer
 * @create 2017-10-25 14:03
 **/

public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    public  void draw(){
        System.out.println("\"Inside Rectangle::draw()");
    }
}
