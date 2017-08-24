package local.projecteuler.completed;

import java.math.BigInteger;

/**
 * Created by johng on 6/4/2016.
 */
public class Problem16 {
    public Problem16() {
        BigInteger sum = new BigInteger("2");

        for(int i = 1; i < 1000; i++)
            sum = sum.multiply(new BigInteger("2"));

        String s = sum.toString();
        int t = 0;
        for(int i = 0; i < s.length(); i++)
            t+= Integer.parseInt(s.substring(i, i+1));

        System.out.println("Answer: " + t);
    }
}
