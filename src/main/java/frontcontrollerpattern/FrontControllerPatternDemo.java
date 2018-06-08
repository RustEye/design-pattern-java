package frontcontrollerpattern;

/**
 * @author Meer
 * @create 2018-06-08 21:58
 **/

public class FrontControllerPatternDemo {
    public static void main(String[] args){
        FrontController frontController = new FrontController();

        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
