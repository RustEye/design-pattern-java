package strategypattern;

/**
 * 测试
 *
 * @author Meer
 * @create 2018-06-04 21:19
 **/

public class StrategyPatternDemo {
    public static void main(String[] args){
        Context context = new Context(new OperationAdd());
        System.out.println("10+5= "+context.exec(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10-5= "+context.exec(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10*5= "+context.exec(10, 5));
    }
}
