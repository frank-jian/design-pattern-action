package factory;

/**
 * @author jianweilin
 * @date 2018/7/31
 */
public class SubFactory implements Operation{

    @Override
    public double getResult(double numA, double numB) {
        return numA - numB;
    }
}
