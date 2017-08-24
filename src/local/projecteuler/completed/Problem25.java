package local.projecteuler.completed;

import java.math.BigInteger;

/**
 * Created by johng on 6/4/2016.
 */
public class Problem25 {

    public Problem25() {

        BigInteger f1 = new BigInteger("1");
        BigInteger f2 = new BigInteger("1");
        BigInteger temp = new BigInteger("0");
        for (long i = 2; i < 1000000000L; i++) {
            temp = f1.add(f2);

            if (temp.toString().length() == 1000) {
                System.out.println("Answer: " + ++i);
                break;
            }

            f1 = f2;
            f2 = temp;
        }
    }
}
