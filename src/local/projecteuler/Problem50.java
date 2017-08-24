package local.projecteuler;


import local.projecteuler.lib.Primes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johng on 6/6/2016.
 */
public class Problem50 {
    public Problem50() {
        List<Integer> sieve = new ArrayList<>();
        for(int i = 2; i < 1000000; ) {
            sieve.add(i);
            i = (int) Primes.getNextPrime(i);
        }
        int sum = 0;
        for(int i = 0; i < 6; i++) {
            sum += sieve.get(i);
        }

        System.out.println("Sum = " + sum);
    }

}
