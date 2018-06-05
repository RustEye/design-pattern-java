package proxypattern;

/**
 * 测试
 *
 * @author Meer
 * @create 2018-06-03 21:15
 **/

public class ProxyImageDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("test.jpg");

        image.display();
    }
}
