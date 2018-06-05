package strategypattern;

/**
 * 策略
 *
 * @author Meer
 * @create 2018-06-04 21:17
 **/

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int exec(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}
