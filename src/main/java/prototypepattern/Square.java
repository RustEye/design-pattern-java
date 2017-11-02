package prototypepattern;

/**
 * 继承Shape的实体类
 *
 * @author Meer
 * @create 2017-10-25 14:03
 **/

public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    public  void draw(){
        System.out.println("\"Inside Square::draw()");
    }
}
