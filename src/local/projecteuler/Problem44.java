package local.projecteuler;

import java.util.HashMap;

/**
 * Created by johng on 7/12/2016.
 */
public class Problem44 {
    public Problem44() {
        HashMap<Integer, Long> sieve = new HashMap<>();
        for(int i = 1; i < 10; i++) {
            long p = i*(3*i-1)/2;
//            System.out.println(i + " = " + p);
            sieve.put(i, p);
        }

    }
}
