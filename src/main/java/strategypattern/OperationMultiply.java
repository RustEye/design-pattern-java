package strategypattern;

/**
 * 加
 *
 * @author Meer
 * @create 2018-06-04 21:14
 **/

public class OperationMultiply implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
