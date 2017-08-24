package local.projecteuler.completed;

import java.math.BigInteger;

/**
 * Created by johng on 6/4/2016.
 */
public class Problem48 {
    public Problem48() {
        BigInteger sum = new BigInteger("0");
        for(int i = 1; i <= 1000; i++)
            sum = sum.add(selfPower(i));

        System.out.println("Answer: " + sum.toString().substring(sum.toString().length()-10));
    }

    private static BigInteger selfPower(int num) {
        BigInteger a = new BigInteger(Integer.toString(num));
        for(int i = 1;i<num;i++)
            a = a.multiply(new BigInteger(Integer.toString(num)));

        return a;
    }

}
