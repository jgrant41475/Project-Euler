package local.projecteuler.completed;

import java.math.BigInteger;

/**
 * Created by johng on 6/2/2016.
 */
public class Problem20 {
    public Problem20() {
        BigInteger f = new BigInteger("1");
        for(int i = 1; i < 100; i++) {
            f = f.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(f);

        String fString = f.toString();
        int sum = 0;
        for(int i = 0; i < fString.length(); i++) {
            sum+= Integer.parseInt(String.valueOf(fString.charAt(i)));
        }

        System.out.println("Answer: " + sum);
    }
}
