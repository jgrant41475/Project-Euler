package local.projecteuler.completed;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by johng on 7/8/2016.
 */
public class Problem29 {
    public Problem29() {
        Set<BigInteger> set = new HashSet<>();
        for(int a = 2; a <= 100; a++) {
            for(int b = 2; b <= 100; b++) {
                BigInteger bigInt = new BigInteger(String.valueOf(a));

                set.add(bigInt.pow(b));
            }
        }

        System.out.println("answer: " + set.size());
    }
}
