package local.projecteuler;

import local.projecteuler.lib.Primes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johng on 6/26/2016.
 */
public class Problem49 {

    public Problem49() {
        permutation("", "1234");

//        for(long i = Primes.getNextPrime(1000); i < 10000; i = Primes.getNextPrime(i)) {
//            System.out.println(i);
//        }
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            if(Primes.isPrime(Integer.parseInt(prefix)))
                System.out.println("Found: " + prefix);
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

}
